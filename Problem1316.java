import java.io.*;
import java.util.*;

public class Problem1316 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcase = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < testcase; i++) {
            String word = br.readLine();
            if(group_word_checker(word)) result++;
        }


        System.out.println(result);


    }
    public static boolean group_word_checker(String word){
        int[] alphabet = new int[26];
        for(int i=0; i<word.length(); i++){
            if(i==0) alphabet[(int)word.charAt(i)-(int)'a']++;
            else if(word.charAt(i) != word.charAt(i-1) && alphabet[(int)word.charAt(i)-(int)'a'] != 0){
                    return false;
            }
            else{
                alphabet[(int)word.charAt(i)-(int)'a']++;
            }

        }
        return true;
    }
}

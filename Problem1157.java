import java.io.*;
import java.util.*;

public class Problem1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] alphabet = new int[26];
        String str = scanner.nextLine().toLowerCase();
        for(int i=0; i<str.length(); i++){
            alphabet[str.charAt(i)- (int)'a']++;
        }
        int max = 0;
        int max_index = 0;
        int cnt = 0;
        for (int i = 0; i < alphabet.length; i++) {
            if(max < alphabet[i]){
                max = alphabet[i];
                max_index = i;
            }
        }

        for (int num : alphabet) {
            if (num==max){
                cnt++;
            }
        }

        if (cnt == 1) {
            System.out.println((char)(max_index+(int)'A'));
        }else{
            System.out.println("?");
        }


    }
}

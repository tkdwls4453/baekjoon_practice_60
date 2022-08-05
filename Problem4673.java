import java.io.*;
import java.util.*;

public class Problem4673 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10001];

        for(int i=1; i<arr.length; i++){
            String temp = Integer.toString(i);
            int sum = i;
            for (int j = 0; j < temp.length(); j++) {
                sum += temp.charAt(j) - '0';
            }
            if(sum<=10000){
                arr[sum] = 1;
            }
        }

        for(int i=1; i<arr.length; i++){
            if(arr[i] == 0){
                bw.write(String.format("%d", i)+"\n");
            }
        }
        bw.flush();
        bw.close();
    }
}

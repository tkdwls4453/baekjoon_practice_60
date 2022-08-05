import java.util.*;
import java.io.*;

public class Problem1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int cur_num = num;
        int result = 0;
        int first = num / 10;
        int second = num % 10;

        while(true){
            int temp = first;
            first = second;
            second = (temp + second) % 10;
            cur_num = first * 10 + second;
            result++;
            if(cur_num == num){
                break;
            }
        }

        System.out.println(result);

    }
}

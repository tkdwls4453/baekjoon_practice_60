import java.io.*;
import java.util.*;


public class Problem2884 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();

        m -= 45;
        if(m < 0){
            h -= 1;
            m += 60;
        }
        if(h < 0){
            h += 24;
        }

        System.out.println(h + " " + m);
    }
}

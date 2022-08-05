import java.io.*;
import java.util.*;

public class Problem2941 {
    public static void main(String[] args) {

        String[] cro_array = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        for(String cro : cro_array){
            str = str.replaceAll(cro, "0");
        }

        System.out.println(str.length());
    }
}

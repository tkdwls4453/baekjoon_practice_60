import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int firstNum = Integer.parseInt(br.readLine());
        String secondNum = br.readLine();
        br.close();

        char[] secondNumArray = secondNum.toCharArray();
        System.out.println(firstNum * (secondNumArray[2]) - '0');
        System.out.println(firstNum * (secondNumArray[1]) - '0');
        System.out.println(firstNum * (secondNumArray[0]) - '0');
        System.out.println(firstNum * Integer.parseInt(secondNum));
    }
}

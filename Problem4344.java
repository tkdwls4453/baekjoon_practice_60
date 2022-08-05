import java.io.*;
import java.util.StringTokenizer;

public class Problem4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < testcase; i++) {
            st = new StringTokenizer(br.readLine());

            int innerCount = Integer.parseInt(st.nextToken());
            int[] group = new int[innerCount];
            float sum = 0;
            for (int j = 0; j < innerCount; j++) {
                group[j] = Integer.parseInt(st.nextToken());
                sum += group[j];
            }
            float avg = sum / innerCount;

            float cnt = 0;
            for(int k : group){
                if(k > avg){
                    cnt++;
                }
            }
            bw.write(String.format("%.3f", cnt * 100.000 / innerCount) + "%\n");
        }
        bw.flush();
        bw.close();
    }
}

import java.io.*;
import java.util.StringTokenizer;

public class Test04_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            bw.write("Case #"+i+": "+A+" + " +B+" = " + (A+B) + "\n");
            //StringBuilder 사용 append append 체인식으로 사용 가능
        }
        br.close();

        bw.flush();//BufferedWriter를 close 하기 전에는 flush를 꼭 해줘야 한다.
        bw.close();

    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); //String으로 짜르는 형식이 아니면 StringTokenizer 사용 할 필요 없음.
        br.close();

        for (int i = 1; i < 10; i++) {
            System.out.println(n + " * " + i +" = " + (n * i));
        }
    }
}

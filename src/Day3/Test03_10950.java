package Day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test03_10950 {
    public static void main(String[] args) throws IOException {
        //A + B
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            arr[i] = A + B;
        }
        br.close();
        for (int i:
             arr) {
            System.out.println(i);
        }
    }
}

package Day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test11_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer sr;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sr = new StringTokenizer(br.readLine(), " ");
            int[] scoreArr = new int[Integer.parseInt(sr.nextToken())];
            int sum = 0;

            for (int j = 0; j < scoreArr.length; j++) {
                scoreArr[j] = Integer.parseInt(sr.nextToken());
                sum += scoreArr[j];
            }

            int avg = sum / scoreArr.length;
            int overAvgCount = 0;
            for (int j : scoreArr) {
                if(j > avg) overAvgCount++;
            }
            String result = String.format("%.3f", ((double)overAvgCount/(double)scoreArr.length) * 100);
            sb.append(result).append("%").append("\n");
        }
        System.out.println(sb);
    }
}

package Day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test11_8985 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            int score = 0;//점수
            int count = 1;// 연속 O일수 점수 누적
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    score += count++;
                } else {
                    count = 1;
                }
            }
            sb.append(score).append("\n");
        }
        System.out.println(sb);
    }
}

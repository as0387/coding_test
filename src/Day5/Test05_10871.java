package Day5;

import java.io.*;
import java.util.StringTokenizer;

public class Test05_10871 {
    public static void main(String[] args) throws IOException {
        //지정 숫자만큼의 숫자를 받아서 지정 숫자 보다 작은 수만 출력
        
        //첫번째 내가 생각한 방법
       /* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();

        StringTokenizer sr1 = new StringTokenizer(str1, " ");

        int N = Integer.parseInt(sr1.nextToken());
        int X = Integer.parseInt(sr1.nextToken());

        int[] numArr = new int[N];

        String str2 = br.readLine();
        StringTokenizer sr2 = new StringTokenizer(str2, " ");
        for (int i = 0; i < N; i++) {
            numArr[i] = Integer.parseInt(sr2.nextToken());
        }
        br.close();

        for (int i:
             numArr) {
            if(i < X) bw.write(i + " ");
        }
        bw.flush();
        bw.close();*/

        //두번째 더 나은 방법  출력을 어떻게해야 효율적일지 생각! (첫번째는 for문이 두번들어가서 실행 시간 증가)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();

        StringTokenizer sr1 = new StringTokenizer(str1, " ");

        int N = Integer.parseInt(sr1.nextToken());
        int X = Integer.parseInt(sr1.nextToken());

        StringBuilder sb = new StringBuilder();

        String str2 = br.readLine();
        StringTokenizer sr2 = new StringTokenizer(str2, " ");
        br.close();
        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(sr2.nextToken());
            if(value < X) sb.append(value).append(" ");
        }
        System.out.println(sb);
    }
}

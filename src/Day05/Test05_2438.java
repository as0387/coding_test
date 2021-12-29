package Day05;

import java.io.*;

public class Test05_2438 {
    public static void main(String[] args) throws IOException {
        //직각삼각형 내림차순 모양
        //일반적인 풀이
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        br.close(); //사용 끝났으면 close해주자!
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                bw.write("*");
            }
           bw.newLine();//줄바꿈
        }
        bw.flush();
        bw.close();
        //거의 속도가 2배 차이난다.
    }
}

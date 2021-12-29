package Day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test02_1330 {
    public static void main(String[] args) throws IOException {
        //성적 산출
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        System.out.println((a >= 90) ? "A" : (a >= 80)  ? "B" : (a >= 70) ? "C" : (a >= 60) ? "D" : "F");
    }
}

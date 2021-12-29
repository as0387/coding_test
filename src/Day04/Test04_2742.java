package Day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test04_2742 {
    public static void main(String[] args) throws IOException {
        //거꾸로 반복문
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

package Day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test06_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(br.readLine());
        br.close();
        int resultNum = inputNum;
        int count = 0;
        while(true){
            int tenDigit = (resultNum % 10) * 10;
            int onetDigit = ((resultNum / 10) + (resultNum % 10)) % 10;
            resultNum = tenDigit + onetDigit;
            count++;
            if (inputNum == resultNum) break;
        }
        System.out.println(count);
    }
}

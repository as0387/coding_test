package Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test02_2753 {
    public static void main(String[] args) throws IOException {
        //운년 계산
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        if(year % 4 == 0){
            if(year % 400 == 0){
                System.out.println(1);
            }else if(year % 100 == 0){
                System.out.println(0);
            }else{
                System.out.println(1);
            }

        }else{
            System.out.println(0);
        }
    }
}

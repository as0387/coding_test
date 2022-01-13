package Day18;

import java.util.ArrayList;

public class Test18_4673 {


    public static void main(String[] args) {
        boolean[] flag = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int n = d(i);

            if(n < 10001) flag[n] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 10001; i++) {
            if(flag[i]) sb.append(i).append("\n");
        }
        System.out.println(sb);
    }

    private static int d(int n) {
        //일의 자리부터 하나씩 더함
        int sum = n;
        while(n != 0){
            sum += n % 10;
            n /= 10;//1의자리씩 제거
        }
        return sum;
    }
}

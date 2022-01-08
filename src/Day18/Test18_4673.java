package Day18;

import java.util.ArrayList;

public class Test18_4673 {

    public static int d(int n){
        int sum = n;

        while(n != 0){//1자리씩 없애는 법 기억해!
            sum += n % 10;//첫번째 자리
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        boolean[] flag = new boolean[10001];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 10001; i++) {
            int n = d(i);
            if(n < 10001) flag[n] = true;
        }

        for (int i = 1; i < 10001; i++) {
            if(!flag[i]) sb.append(i).append("\n");//false가 기본값이니 true아닌거가 없는 숫자임
        }
        System.out.println(sb);
    }
}

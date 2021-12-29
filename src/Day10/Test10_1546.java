package Day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test10_1546 {
    public static void main(String[] args) throws IOException {
        //3개 수 받고 평점 올리는 식을 이용해서 평균값 구하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] arr = new double[Integer.parseInt(br.readLine())];

        StringTokenizer sr = new StringTokenizer(br.readLine(), " ");
        double max = 0;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sr.nextToken());
            if(max < arr[i]){
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] / max * 100;
        }
        for (double i : arr) {
            sum += i;
        }
        System.out.println((sum / arr.length));
    }
}

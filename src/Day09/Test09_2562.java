package Day09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test09_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        List<Integer> list = new ArrayList<>();
//
//        list.add(Integer.parseInt(br.readLine()));
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
    int max = arr[0];
    int num = 0;
        for (int i:
             arr) {
            num++;
            if (max < i) {
                max = i;
            }
        }
        System.out.println(max);
        System.out.println(num);
    }
}
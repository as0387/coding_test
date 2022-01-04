package Day15;

import java.io.BufferedReader;
import java.util.Arrays;

public class Test15_15596 {

    long sum(int[] a) {
        long ans = 0;
        for (int l : a) {
            ans += l;
        }
        return ans;
    }

    public static void main(String[] args) {
        Test15_15596 t = new Test15_15596();

        int[] a = {1,2,3,4,5};
        System.out.println(t.sum(a));
    }
}

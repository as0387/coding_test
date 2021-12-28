package Day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Test10_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine()) % 42;
            map.put(n,n);
        }
        System.out.println(map.keySet().size());

    }
}

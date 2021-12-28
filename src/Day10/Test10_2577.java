package Day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Test10_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Character, Integer> map = new HashMap<>();
        char[] keys = {'0','1','2','3','4','5','6','7','8','9'};
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int multi = A * B * C;
        String str = multi + ""; //이렇게 하면 int를 간단하게 문자열로 바꿀 수 있다.(좋은 방법인지는 안알아보았다..ㅎ)

        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], 0);
        }//0~9까지 키값별 기본값 0 설정

        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i))){
                int count = map.get(str.charAt(i));
                map.put(str.charAt(i), count + 1);
            }
        }//map에 key값과 같은 문자가 있으면 value값 구해서 + 1 한다음 다시 put
        for (char c: keys) {
            System.out.println(map.get(c));
        }
    }
}

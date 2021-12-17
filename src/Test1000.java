import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test1000 {
    public static void main(String[] args) throws IOException {
        //단순 규칙으로 문자열을 분리해줄 떄 StringToKenizer를 사용하자!

        //System.in이 뭐야?? -> InputStream의 정적 필드
        //InputStreamReader -> InputStream의 확장된 클래스
        //InputStream의 특징은 1. 입력받은 데이터는 int형으로 저장되는데 그것이 10진수 UTF-16이다
        //                   2. 1 byte만 읽는다.
        //따라서 InputStreamReader 클래스는 InputStream으로 읽은  byte타입의 데이타를 문자단위로 변환시키는 역할을 함
        //이에 InputStreamReader를 문자 스트림이라 한다.
        //하지만 InputStreamReader는 문자를 처리하는 클래스이지 '문자열'이 아니다.
        //그래서 사용하는 것이 BufferedReader이다.
        //BufferedReader는 버퍼에 입력받은 문자를 저장해 쌓아둔후 문자열처럼 스트림으로 보내는것이다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        //StringTokenizer 역할 -> split()메서드와 비슷
        StringTokenizer st = new StringTokenizer(str, " ");//분리할 문자열과 분리 기준을 파라미터로 넘겨준다.

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a + b);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test03__2884 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str, " ");

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        if(minute < 45){//분은  0 아래면 시가 -1 되야하기때문에
            hour--;
            if(hour < 0) hour = 23;
            minute = 60 + (minute - 45);
        }else{
            minute -= 45;
        }
        System.out.println(hour+" "+minute);
    }
}

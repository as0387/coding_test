package programmers;

public class Test01 {
    public int solution(String s) {
        String[]  nums = {"0","1","2","3","4","5","6","7","8","9"};
        String[] words = {"zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"};
        for (int i = 0 ; i <10 ; i++){
            s = s.replace(words[i] , nums[i]);
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Test01 test01 = new Test01();
        System.out.println(test01.solution("one4seveneight"));
    }
}

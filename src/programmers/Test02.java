package programmers;

public class Test02 {
    public String solution(int[] numbers, String hand) {
        int L = 10;
        int R = 12;
        StringBuilder sb = new StringBuilder();

        for (int n : numbers) {
            if(n == 1 || n == 4 || n == 7){
                sb.append("L");
                L = n;
            }else if(n == 3 || n == 6 || n == 9){
                sb.append("R");
                R = n;
            }else{
                R = (R == 0) ? 11 : R;
                L = (L == 0) ? 11 : L;
                n = (n == 0) ? 11 : n;

                int rx = (R - 1) / 3;
                int ry = (R - 1) % 3;

                int lx = (L - 1) / 3;
                int ly = (L - 1) % 3;

                int nx = (n - 1) / 3;
                int ny = 1;

                int rWay = Math.abs(rx - nx) + Math.abs(ry - ny);
                int lWay = Math.abs(lx - nx) + Math.abs(ly - ny);

                if(rWay > lWay){
                    sb.append("L");
                    L = n;
                }else if(lWay > rWay){
                    sb.append("R");
                    R = n;
                }else if (lWay == rWay){
                    if(hand.equals("right")) {
                        sb.append("R");
                        R = n;
                    }else{
                        sb.append("L");
                        L = n;
                    }
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Test02 test02 = new Test02();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(test02.solution(arr, "right"));
    }
}

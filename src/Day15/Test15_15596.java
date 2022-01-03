package Day15;

import java.io.BufferedReader;

public class Test15_15596 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int maxCount = 0;
        int minCount = 0;
        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < lottos.length; j++) {
                if(lottos[i] == win_nums[j]){
                    minCount++;
                }
            }
            if(lottos[i] == 0) maxCount++;
        }
        maxCount += minCount;
        if(minCount == 0) minCount++;

        switch (maxCount){
            case 6:
                answer[0] = 1;
                break;
            case 5:
                answer[0] = 2;
                break;
            case 4:
                answer[0] = 3;
                break;
            case 3:
                answer[0] = 4;
                break;
            case 2:
                answer[0] = 5;
                break;
            default:
                answer[0] = 6;
        }

        switch (minCount){
            case 6:
                answer[1] = 1;
                break;
            case 5:
                answer[1] = 2;
                break;
            case 4:
                answer[1] = 3;
                break;
            case 3:
                answer[1] = 4;
                break;
            case 2:
                answer[1] = 5;
                break;
            default:
                answer[1] = 6;
        }
        return answer;
    }
}

package lesson10;

import java.util.ArrayList;
import java.util.List;

public class Peaks {

    public int solution(int[] A) {
        if(A.length < 3) return 0;

        List<Integer> peekList = new ArrayList<>();

        // find peek idx
        for(int i = 1; i < A.length - 1; i++) {
            if(A[i] >= A[i-1] && A[i] >= A[i+1]) {
                peekList.add(i);
            }
        }

        // TODO :: 배열 A가 나눌 수 있는 최대 블록을 구해라.

        return peekList.size();
    }
}

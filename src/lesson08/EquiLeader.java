package lesson08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EquiLeader {

    public int solution(int[] A) {

        Map<Integer, Integer> counter = new HashMap<>();
        int leader = A[0];
        int leaderCount = 0;

        for (int item : A) {
            counter.put(item, counter.getOrDefault(item, 0) + 1);

            if (counter.get(item) > leaderCount) {
                leader = item;
                leaderCount = counter.get(item);
            }
        }

        List<Integer> scanner = new ArrayList<>();
        int idxCounter = 0;
        for (int item : A) {
            if (leader == item) {
                idxCounter++;
            }
            // 각 인덱스 별 리더의 수 저장
            scanner.add(idxCounter);
        }

        int result = 0;
        int leftLeaderCount = 0;
        int rightLeaderCount = leaderCount;
        for(int i=0; i < A.length; i++) {
            leftLeaderCount = scanner.get(i);
            rightLeaderCount = scanner.get(A.length - 1) - leftLeaderCount;

            if( (leftLeaderCount > ((i+1)/2)) && (rightLeaderCount > ((A.length - (i+1)) / 2)) ) {
                result++;
            }
        }

        return result;
    }
}

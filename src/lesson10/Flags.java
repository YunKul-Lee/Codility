package lesson10;

import java.util.ArrayList;
import java.util.List;

public class Flags {

    public int solution(int[] A) {
        if(A.length < 3) return 0;

        int peekCount = 0;
        List<Integer> peekList = new ArrayList<>();

        // find peek idx
        for(int i = 1; i < A.length - 1; i++) {
            if(A[i] >= A[i-1] && A[i] >= A[i+1]) {
                peekList.add(i);
            }
        }

        // TODO :: count
        if(peekList.size() < 2) return peekList.size();



        return peekCount;
    }

    public static void main(String[] args) {
        int[] A = {1,5,3,4,3,4,1,2,3,4,6,2};
        Flags flags = new Flags();

        System.out.println(flags.solution(A));
    }
}

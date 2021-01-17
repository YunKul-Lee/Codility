package lesson05;

public class MinAvgTwoSlice {

    public int solution(int[] A) {

        double minAvg = (A[0] + A[1]) / 2d;
        int minIndex = 0;

        for(int i=2; i < A.length; i++ ) {

            double avg3 = ((A[i] + A[i-1] + A[i-2])) / 3d;
            if(avg3 < minAvg) {
                minAvg = avg3;
                minIndex = i-2;
            }

            double avg2 = (A[i] + A[i-1]) / 2d;
            if(avg2 < minAvg) {
                minAvg = avg2;
                minIndex = i-1;
            }
        }

        return minIndex;
    }
}



package lesson09;

public class MaxDoubleSliceSum {

    public int solution(int[] A) {

        int[] leftMaxSum = new int[A.length];
        int[] rightMaxSum = new int[A.length];

        for(int i = 1; i < A.length; i++) {
            leftMaxSum[i] = Math.max(leftMaxSum[i-1] + A[i], 0);
        }

        for(int i = (A.length - 2); i >= 0; i--) {
            rightMaxSum[i] = Math.max(rightMaxSum[i+1] + A[i], 0);
        }

        int maxDoubleSlice = 0;
        for(int i=1; i < A.length-1; i++) {
            if(leftMaxSum[i-1] + rightMaxSum[i+1] > maxDoubleSlice) {
                maxDoubleSlice = leftMaxSum[i-1] + rightMaxSum[i+1];
            }
        }

        return maxDoubleSlice;
    }
}

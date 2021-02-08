package lesson09;

public class MaxSliceSum {

    public int solution(int[] A) {

        if(A.length == 1) return A[0];

        int maxSum = A[0];
        int maxSliceSum = A[0];

        for(int i = 1; i < A.length; i++) {
            maxSum = Math.max(A[i], maxSum + A[i]);
            maxSliceSum = Math.max(maxSliceSum, maxSum);
        }

        return maxSliceSum;
    }
}

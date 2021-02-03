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

    public static void main(String[] args) {
//        int[] A = {3,2,-6,4,0};
        int[] A = {-2,1};

        MaxSliceSum mss = new MaxSliceSum();

        System.out.println(">>>>>>>>>>>>>>");
        System.out.println(mss.solution(A));
    }
}

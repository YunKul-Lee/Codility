package lesson06;

import java.util.Arrays;

public class MaxProductOfThree {
    public int solution(int[] A) {
        // 정렬
        Arrays.sort(A);
        int idx = A.length - 1;
        // 최상위 숫자 3개를 이용하여 기본 최대값 계산
        int maxProduct = A[idx] * A[idx - 1] * A[idx -2];

        // 음수가 2개 섞인 경우 체크
        if(A[0] <= 0 && A[1] <= 0 && A[idx] >= 0) {
            int product = A[0] * A[1] * A[idx];

            if(product > maxProduct) maxProduct = product;
        }

        return maxProduct;
    }
}

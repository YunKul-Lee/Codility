package lesson03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A non-empty array A consisting of N integers is given. Array A represents numbers on a tape.
 *
 * Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
 *
 * The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
 *
 * In other words, it is the absolute difference between the sum of the first part and the sum of the second part.
 *
 * For example, consider array A such that:
 *
 *   A[0] = 3
 *   A[1] = 1
 *   A[2] = 2
 *   A[3] = 4
 *   A[4] = 3
 * We can split this tape in four places:
 *
 *      <li></li>P = 1, difference = |3 − 10| = 7</li>
 *      <li>P = 2, difference = |4 − 9| = 5</li>
 *      <li>P = 3, difference = |6 − 7| = 1</li>
 *      <li>P = 4, difference = |10 − 3| = 7</li>
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given a non-empty array A of N integers, returns the minimal difference that can be achieved.
 *
 * For example, given:
 *
 *   A[0] = 3
 *   A[1] = 1
 *   A[2] = 2
 *   A[3] = 4
 *   A[4] = 3
 * the function should return 1, as explained above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 *      <li>N is an integer within the range [2..100,000];</li>
 *      <li>each element of array A is an integer within the range [−1,000..1,000].</li>
 */
public class TapeEquilibrium {

    public int solution(int[] A) {

        // 전체 배열의 합을 계산
        int sumA = 0;
        for(int element : A) {
            sumA += element;
        }

        List<Integer> sumList = new ArrayList<>();
        int left = 0;
        int right = 0;
        // 순차적으로 차의 절대값을 계산하여 List 에 저장
        for(int i=1; i < A.length; i++) {
            left += A[i-1];
            right = sumA - left;

            sumList.add(Math.abs(left - right));
        }

        // 최소값 추출
        return Collections.min(sumList);
    }
}

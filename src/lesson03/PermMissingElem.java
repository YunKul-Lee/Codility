package lesson03;

/**
 * An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
 *
 * Your goal is to find that missing element.
 *
 * Write a function:
 *
 *      class Solution { public int solution(int[] A); }
 *
 * that, given an array A, returns the value of the missing element.
 *
 * For example, given array A such that:
 *
 *   A[0] = 2
 *   A[1] = 3
 *   A[2] = 1
 *   A[3] = 5
 * the function should return 4, as it is the missing element.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 *      <li>N is an integer within the range [0..100,000];</li>
 *      <li>the elements of A are all distinct;</li>
 *      <li>each element of array A is an integer within the range [1..(N + 1)].</li>
 */
public class PermMissingElem {

    public int solution(int[] A) {

        // 빠짐없는 전체 배열의 합을 구함
        // 전체 합의 경우 int 범위를 초과할 수 있기 때문에 long 타입으로 처리
        long n = A.length + 1;
        long sumTotal = (n * (n + 1)) / 2;

        // 배열 A의 합을 구함
        long sumA = 0;
        for(int element : A) {
            sumA += element;
        }

        // 전체 배열합 - A배열 합 == 누락된 수
        int missingElement = (int)(sumTotal - sumA);

        return missingElement;
    }
}

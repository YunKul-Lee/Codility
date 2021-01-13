package lesson04;

import java.util.*;

/**
 * This is a demo task.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 *
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 *
 * Given A = [1, 2, 3], the function should return 4.
 *
 * Given A = [−1, −3], the function should return 1.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 *      <li>N is an integer within the range [1..100,000];</li>
 *      <li>each element of array A is an integer within the range [−1,000,000..1,000,000].</li>
 */
public class MissingInteger {

    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for(int item : A) {
            set.add(item);
        }

        for(int i=1; i < Integer.MAX_VALUE; i++) {
            if(!set.contains(i)) return i;
        }

        return -1;
    }
}

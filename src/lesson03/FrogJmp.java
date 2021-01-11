package lesson03;

/**
 * A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.
 *
 * Count the minimal number of jumps that the small frog must perform to reach its target.
 *
 * Write a function:
 *
 *      class Solution { public int solution(int X, int Y, int D); }
 *
 * that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.
 *
 * For example, given:
 *
 *   X = 10
 *   Y = 85
 *   D = 30
 * the function should return 3, because the frog will be positioned as follows:
 *
 *      <li>after the first jump, at position 10 + 30 = 40</li>
 *      <li>after the second jump, at position 10 + 30 + 30 = 70</li>
 *      <li>after the third jump, at position 10 + 30 + 30 + 30 = 100</li>
 *
 * Write an efficient algorithm for the following assumptions:
 *
 *      <li>X, Y and D are integers within the range [1..1,000,000,000];</li>
 *      </li>X ≤ Y.</li>
 */
public class FrogJmp {

    public int solution(int X, int Y, int D) {

        // 뛰어야할 최소 거리
        int distance = Y - X;

        // 최소점프 횟수
        int quotient = distance / D;

        // 나머지가 0보다 크면 점프 1회 추가
        if((distance % D) > 0) {
            quotient += 1;
        }

        return quotient;
    }
}

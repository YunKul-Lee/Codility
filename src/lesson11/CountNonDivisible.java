package lesson11;

/**
 * 에라토스테네스의 체(Sieve of Eratosthenes) 참조
 */
public class CountNonDivisible {

    public int[] solution(int[] A) {
        // A[i] 의 비제수 개수를 응답값으로 구성
        int N = A.length;
        int[] result = new int[N];

        // 배열A를 구성하는 숫자의 갯수를 계산
        int[] counter = new int[2 * N + 1];
        for (int item : A) {
            counter[item]++;
        }

        int[] divisible = new int[counter.length];

        // 소소는 배수가 아니기 때문에, 루트 N 까지만 나눌 수 있으면 됨.
        for(int i = 1; i * i < divisible.length; i++) {

            for(int j = i * i; j < divisible.length; j += i) {
                divisible[j] += counter[i];

                if (j != (i * i)) {
                    // 나눌 수 있는 요소의 개수를 카운트
                    divisible[j] += counter[j / i];
                }
            }
        }

        for(int i = 0; i < N; i++) {
            result[i] = N - divisible[A[i]];
        }

        return result;
    }

    public static void main(String[] args) {

        int i = 3;
        int j = 6;

        System.out.println( i % j );
    }
}

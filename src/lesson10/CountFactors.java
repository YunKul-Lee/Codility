package lesson10;

public class CountFactors {

    public int solution(int N) {
        // N = D * M
        int count = 0;

        for(long i = 1; i * i <= N; i++) {
            if( N % i == 0) {
                count++;

                if(i * i < N) count++;
            }
        }
        return count;
    }
}

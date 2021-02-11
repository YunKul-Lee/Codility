package lesson10;

public class MinPerimeterRectangle {

    public int solution(int N) {

        int minPerimeter = 2 * (N + 1);
        int sqrt_num = (int) Math.sqrt(N);

        for(int i = 1; i <= sqrt_num; i++) {

            if(N % i == 0) {
                minPerimeter = Math.min(minPerimeter, (i + (N / i)) * 2);

            }
        }

        return minPerimeter;
    }

    public static void main(String[] args) {
        MinPerimeterRectangle mpr = new MinPerimeterRectangle();
        System.out.println(mpr.solution(30));
    }
}

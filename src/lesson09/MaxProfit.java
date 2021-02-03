package lesson09;

public class MaxProfit {

    public int solution(int[] A) {

        if(A.length < 2) return 0;

        int minPrice = A[0];
        int maxProfit = A[1] - A[0];

        for(int price : A) {
            if(price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;
    }
}

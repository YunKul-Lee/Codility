package lesson07;

import java.util.Stack;

public class Fish {

    public int solution(int[] A, int[] B) {

        Stack<Integer> downStreamFishStack = new Stack<>();
        int upstreamFishCount = 0;

        for(int i=0; i < A.length; i++) {
            if(B[i] == 1) downStreamFishStack.push(A[i]);
            else {

                while (!downStreamFishStack.isEmpty()) {

                    if(downStreamFishStack.peek() > A[i]) {
                        // 하류행 물고기가 더 큼. 다음 상류행과 비교
                        break;
                    } else {
                        // 상류행 물고기가 더 큼. 하류행 제거.
                        downStreamFishStack.pop();
                    }
                }

                // 하류행 물고기가 없음. 상류행 물고기 증가
                if(downStreamFishStack.isEmpty()) {
                    upstreamFishCount++;
                }
            }
        }

        return downStreamFishStack.size() + upstreamFishCount;
    }

    public static void main(String[] args) {
        int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 1, 0, 0, 0};
        Fish fish = new Fish();
        System.out.println(fish.solution(A, B));
    }
}

package lesson06;

import java.util.*;

public class NumberOfDiscIntersections {

    public int solution(int[] A) {
        int N = A.length;
        Circle[] circles = new Circle[N];

        // 원의 정보 구성
        for(int i=0; i < N; i++) {
            circles[i] = new Circle(i - A[i], (long)i + A[i]);
        }

        // 왼쪽 끝 X좌표를 기준으로 정렬
        Arrays.sort(circles, (o1, o2) -> {
            if(o1.leftX > o2.leftX) return 1;
            return -1;
        });

        int interSectionCount = 0;
        for(int i=0; i < N - 1; i++) {
            // 중복체크
            for(int j = i + 1; j < N && circles[i].rightX >= circles[j].leftX; j++) {
                interSectionCount++;
                // 예외조건 처리
                if(interSectionCount > 10_000_000) return -1;
            }
        }

        return interSectionCount;
    }

    class Circle {
        long leftX;     // 왼쪽 끝 X 좌표
        long rightX;    // 오른쪽 끝 X 좌표

        public Circle(long leftX, long rightX) {
            this.leftX = leftX;
            this.rightX = rightX;
        }
    }

}

package lesson01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BinaryGap {

    public int solution(int n) {
        // 양수만 허용
        if(n <= 0) return 0;

        // 2진수로 변환
        String binaryString = Integer.toBinaryString(n);

        // 마지막 1까지 문자열 재구성
        int lastIndexOfOne = binaryString.lastIndexOf('1');
        if(lastIndexOfOne >= 0 && (lastIndexOfOne != (binaryString.length() - 1))) {
            binaryString = binaryString.substring(0, lastIndexOfOne + 1);
        }

        // 1을 기준으로 split
        List<String> list = Arrays.stream( binaryString.split("1") ).filter(e -> !e.equals("")).collect(Collectors.toList());

        // 최대길이 체크
        int maxGap = list.stream().max(Comparator.comparing(e -> e.length())).orElse("").length();

        return maxGap;
    }
}

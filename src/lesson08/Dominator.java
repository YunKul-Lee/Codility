package lesson08;

import java.security.KeyStore;
import java.util.*;

public class Dominator {

    public int solution(int[] A) {

        if(A.length == 0) return -1;

        int criteria = A.length >= 2 ? (A.length / 2) : 0;

        Map<Integer, Integer> dominatorMap = new HashMap<>();

        for(int item : A) {
            dominatorMap.put(item, dominatorMap.getOrDefault(item, 0) + 1);
        }

        Map.Entry<Integer, Integer> dominatorEntry = dominatorMap.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get();

        if(dominatorEntry.getValue() > criteria) {
            for(int i=0; i < A.length; i++) {
                if(A[i] == dominatorEntry.getKey()) {
                    return i;
                }
            }
        }

        return -1;
    }
}

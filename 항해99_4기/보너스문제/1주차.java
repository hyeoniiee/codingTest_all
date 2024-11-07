import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> clothingMap = new HashMap<>();

        for (String[] item : clothes) {
            String type = item[1];
            clothingMap.put(type, clothingMap.getOrDefault(type, 0) + 1);
        }

        int answer = 1;
        for (int count : clothingMap.values()) {
            answer *= (count + 1);
        }

        return answer - 1;
    }
}
// 문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42578
import java.util.HashMap;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        // 1. HashMap에 참가자 명단 추가
        HashMap<String, Integer> map = new HashMap<>();
        for (String p : participant) {
            // 참가자의 이름을 키로, 이름의 등장 횟수를 값으로 저장
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        // 2. 완주자 명단을 순회하며 HashMap에서 해당 이름의 빈도수를 감소
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }

        // 3. 최종적으로 값이 1인 키가 완주하지 못한 선수
        for (String key : map.keySet()) {
            if (map.get(key) != 0) { // 값이 1인 경우, 완주하지 못함
                return key;
            }
        }

        return ""; // 이 줄은 실행되지 않음
    }
}

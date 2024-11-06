import java.util.HashMap;

public class Solution {
    public int solution(int[] nums) {
        // 1. 폰켓몬 종류를 HashMap을 사용해 구함
        HashMap<Integer, Integer> pokemonCount = new HashMap<>();
        for (int num : nums) {
            // 종류별로 폰켓몬의 개수를 추가
            // 현재 종류 번호(num)가 없으면 0을 기본값으로 설정하고 +1
            pokemonCount.put(num, pokemonCount.getOrDefault(num, 0) + 1);
        }

        // 2. 선택할 수 있는 최대 폰켓몬 수 계산
        // 총 선택 가능한 마리 수는 N/2
        int maxSelectable = nums.length / 2;

        // 3. 가능한 최대 종류 수 계산
        // HashMap에 저장된 폰켓몬 종류의 수와 maxSelectable 중 작은 값을 선택
        return Math.min(pokemonCount.size(), maxSelectable);
    }
}

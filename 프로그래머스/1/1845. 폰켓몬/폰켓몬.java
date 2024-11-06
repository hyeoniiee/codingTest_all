import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> pokemonCount = new HashMap<>();
        for (int num : nums) {
            pokemonCount.put(num, pokemonCount.getOrDefault(num, 0) + 1);
        }
        int maxSelectable = nums.length / 2;
        return Math.min(pokemonCount.size(), maxSelectable);
    }
}
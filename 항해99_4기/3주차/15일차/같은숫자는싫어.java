import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr) {
        // 결과를 저장할 리스트
        List<Integer> result = new ArrayList<>();

        // 첫 번째 원소는 무조건 추가
        result.add(arr[0]);

        // 두 번째 원소부터 마지막 원소까지 순회
        for (int i = 1; i < arr.length; i++) {
            // 이전 원소와 다를 때만 추가
            if (arr[i] != arr[i - 1]) {
                result.add(arr[i]);
            }
        }

        // List<Integer>를 int[]로 변환하여 반환
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}

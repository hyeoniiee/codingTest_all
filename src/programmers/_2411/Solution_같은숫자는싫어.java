package programmers._2411;

import java.util.ArrayList;
import java.util.List;

public class Solution_같은숫자는싫어 {
    public int[] solution(int[] arr) {
        List<Integer> result = new ArrayList<>();

        result.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[i - 1]) {
                result.add(arr[i]);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}

package baekjoon._2501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _32978main {
    public static void main(String[] args) throws IOException {
        // 입력 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 줄: 재료의 개수 N
        int N = Integer.parseInt(br.readLine());

        // 두 번째 줄: 봉골레 파스타에 필요한 재료 리스트
        String[] fullFood = br.readLine().split(" ");

        // 세 번째 줄: 현빈이가 사용한 재료 리스트
        String[] usedFood = br.readLine().split(" ");

        // HashMap으로 모든 재료의 빈도를 관리
        Map<String, Integer> foodCount = new HashMap<>();

        // 필요한 재료 리스트를 HashMap에 추가 (빈도 증가)
        for (String food : fullFood) {
            foodCount.put(food, foodCount.getOrDefault(food, 0) + 1);
        }

        // 사용한 재료 리스트를 HashMap에서 제거 (빈도 감소)
        for (String food : usedFood) {
            foodCount.put(food, foodCount.get(food) - 1);
        }

        // 남아 있는 재료를 찾음 (빈도가 1인 재료가 빼먹은 재료)
        for (String food : foodCount.keySet()) {
            if (foodCount.get(food) == 1) {
                System.out.println(food);
                break; // 결과를 찾았으므로 반복 종료
            }
        }
    }
}

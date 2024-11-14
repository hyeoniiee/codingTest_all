// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/42583

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge_queue = new LinkedList<>();
        int time = 0;            // 경과 시간
        int current_weight = 0;  // 현재 다리 위 트럭의 총 무게
        int index = 0;           // 대기 중인 트럭의 인덱스

        // 다리 길이만큼 0을 초기화하여 다리를 빈 상태로 만듦
        for (int i = 0; i < bridge_length; i++) {
            bridge_queue.add(0);
        }

        while (index < truck_weights.length) {
            time++;  // 시간 증가
            current_weight -= bridge_queue.poll(); // 맨 앞 트럭을 제거하고 무게 감소

            // 다음 트럭을 올릴 수 있는지 확인
            if (current_weight + truck_weights[index] <= weight) {
                bridge_queue.add(truck_weights[index]);
                current_weight += truck_weights[index];
                index++;
            } else {
                bridge_queue.add(0); // 트럭을 올릴 수 없으면 빈 공간 추가
            }
        }

        // 모든 트럭이 다리에 올라간 이후 다리를 비우는 시간 추가
        time += bridge_length;
        return time;
    }
}

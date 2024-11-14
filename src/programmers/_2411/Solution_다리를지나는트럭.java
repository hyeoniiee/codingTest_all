package programmers._2411;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_다리를지나는트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge_queue = new LinkedList<>();
        int time = 0;
        int current_weight = 0;
        int index = 0;

        for (int i = 0; i < bridge_length; i++) {
            bridge_queue.add(0);
        }

        while (index < truck_weights.length) {
            time++;
            current_weight -= bridge_queue.poll();

            if (current_weight + truck_weights[index] <= weight) {
                bridge_queue.add(truck_weights[index]);
                current_weight += truck_weights[index];
                index++;
            } else {
                bridge_queue.add(0);
            }
        }

        time += bridge_length;
        return time;
    }
}

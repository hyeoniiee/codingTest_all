package baekjoon._2411;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _1417main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int dasomVotes = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 1; i < n; i++) {
            pq.add(sc.nextInt());
        }

        int bribes = 0;

        while (!pq.isEmpty() && pq.peek() >= dasomVotes) {
            int maxVotes = pq.poll();
            maxVotes--;
            dasomVotes++;
            bribes++;
            pq.add(maxVotes);
        }

        System.out.println(bribes);
    }
}
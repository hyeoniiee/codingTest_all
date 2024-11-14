package baekjoon._2411;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _26042main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        int maxQueueSize = 0;
        int minLastStudent = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int type = sc.nextInt();

            if (type == 1) {
                int student = sc.nextInt();
                queue.add(student);

                int queueSize = queue.size();
                int lastStudent = student;

                if (queueSize > maxQueueSize || (queueSize == maxQueueSize && lastStudent < minLastStudent)) {
                    maxQueueSize = queueSize;
                    minLastStudent = lastStudent;
                }

            } else if (type == 2) {
                if (!queue.isEmpty()) {
                    queue.poll();
                }
            }
        }

        System.out.println(maxQueueSize + " " + minLastStudent);
    }
}

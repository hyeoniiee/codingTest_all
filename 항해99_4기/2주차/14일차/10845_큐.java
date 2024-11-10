// 문제 링크 : https://www.acmicpc.net/problem/10845
// 알고리즘 : 자료구조, 큐

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 명령의 수 입력
        scanner.nextLine(); // 개행 문자 제거

        Queue<Integer> queue = new LinkedList<>(); // 큐 구현
        StringBuilder output = new StringBuilder(); // 결과 출력을 위한 StringBuilder

        // 명령 처리
        for (int i = 0; i < N; i++) {
            String command = scanner.nextLine(); // 각 명령어 입력

            if (command.startsWith("push")) {
                // push 명령어의 경우, 숫자를 큐에 추가
                int X = Integer.parseInt(command.split(" ")[1]);
                queue.add(X);

            } else if (command.equals("pop")) {
                // pop: 큐에서 가장 앞의 정수를 제거하고 출력, 큐가 비어있으면 -1 출력
                output.append(queue.isEmpty() ? -1 : queue.poll()).append("\n");

            } else if (command.equals("size")) {
                // size: 큐에 들어있는 정수의 개수 출력
                output.append(queue.size()).append("\n");

            } else if (command.equals("empty")) {
                // empty: 큐가 비어있으면 1 출력, 그렇지 않으면 0 출력
                output.append(queue.isEmpty() ? 1 : 0).append("\n");

            } else if (command.equals("front")) {
                // front: 큐의 가장 앞에 있는 정수를 출력, 큐가 비어있으면 -1 출력
                output.append(queue.isEmpty() ? -1 : queue.peek()).append("\n");

            } else if (command.equals("back")) {
                // back: 큐의 가장 뒤에 있는 정수를 출력, 큐가 비어있으면 -1 출력
                output.append(queue.isEmpty() ? -1 : ((LinkedList<Integer>) queue).getLast()).append("\n");
            }
        }

        System.out.print(output.toString()); // 최종 결과 출력
        scanner.close();
    }
}

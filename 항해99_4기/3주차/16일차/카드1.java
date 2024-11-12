import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _2161main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 카드 개수 N 입력
        int N = sc.nextInt();

        // 큐를 초기화하여 1 부터 N 까지의 카드 삽입
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i); // 카드 i 를 큐의 끝에 추가
        }

        // 결과를 저장하는 변수 선언
        StringBuilder result = new StringBuilder();

        // 카드가 한장이 남을때까지 반복
        while (queue.size() > 1) {
            result.append(queue.poll()).append(" "); // 맨 위 카드는 버림
            queue.add(queue.poll()); // 그 다음 카드는 큐의 맨 마지막으로 이동
        }

        result.append(queue.poll()); // 마지막 남은 카드 추가

        System.out.println(result.toString()); // 결과 출력
    }
}
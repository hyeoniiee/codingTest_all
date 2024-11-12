import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        StringBuilder result = new StringBuilder();

        while (queue.size() > 1) {
            result.append(queue.poll()).append(" ");
            queue.add(queue.poll());
        }

        result.append(queue.poll());

        System.out.println(result.toString());
    }
}
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String command = scanner.nextLine();

            if (command.startsWith("push")) {
                int X = Integer.parseInt(command.split(" ")[1]);
                queue.add(X);

            } else if (command.equals("pop")) {
                output.append(queue.isEmpty() ? -1 : queue.poll()).append("\n");

            } else if (command.equals("size")) {
                output.append(queue.size()).append("\n");

            } else if (command.equals("empty")) {
                output.append(queue.isEmpty() ? 1 : 0).append("\n");

            } else if (command.equals("front")) {
                output.append(queue.isEmpty() ? -1 : queue.peek()).append("\n");

            } else if (command.equals("back")) {
                output.append(queue.isEmpty() ? -1 : ((LinkedList<Integer>) queue).getLast()).append("\n");
            }
        }

        System.out.print(output.toString());
    }
}

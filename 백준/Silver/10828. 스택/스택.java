import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Integer> stack = new ArrayList<>();

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String command = sc.nextLine();

            if (command.startsWith("push")) {
                int value = Integer.parseInt(command.split(" ")[1]);
                stack.add(value);
            } else if (command.equals("pop")) {
                if (stack.isEmpty()) {
                    output.append("-1\n");
                } else {
                    output.append(stack.remove(stack.size() - 1)).append("\n");
                }
            } else if (command.equals("size")) {
                output.append(stack.size()).append("\n");
            } else if (command.equals("empty")) {
                output.append(stack.isEmpty() ? "1\n" : "0\n");
            } else if (command.equals("top")) {
                if (stack.isEmpty()) {
                    output.append("-1\n");
                } else {
                    output.append(stack.get(stack.size() - 1)).append("\n");
                }
            }
        }

        System.out.print(output);
    }
}

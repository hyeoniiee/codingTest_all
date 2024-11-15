package codetree._2411;

import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        while (input.length() > 1) {

            int index = scanner.nextInt();

            if (index >= input.length()) {
                input = input.substring(0, input.length() - 1);
            } else {
                input = input.substring(0, index) + input.substring(index + 1);
            }

            System.out.println(input);
        }
    }
}

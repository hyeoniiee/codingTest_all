package codetree._2411;

import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        String result = input.substring(0, 1) +
                input.substring(2, input.length() - 2) +
                input.substring(input.length() - 1);

        System.out.println(result);
    }
}

package codetree._2411;

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        char firstChar = input.charAt(0);
        char secondChar = input.charAt(1);

        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if ( c == secondChar) {
                result.append(firstChar);
            } else {
                result.append(c);
            }
        }

        System.out.println(result.toString());
    }
}

package codetree._2411;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);

        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c == firstChar) {
                result.append(secondChar);
            } else if (c == secondChar) {
                result.append(firstChar);
            } else {
                result.append(c);
            }
        }

        System.out.println(result.toString());
    }
}

package baekjoon._2411;

import java.util.Scanner;

public class _11720main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String numbers = sc.next();

        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += numbers.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}

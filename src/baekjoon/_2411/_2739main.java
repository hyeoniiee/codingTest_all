package baekjoon._2411;

import java.util.Scanner;

public class _2739main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(N + " * " + i + " = " + (N * i));
        }
    }
}

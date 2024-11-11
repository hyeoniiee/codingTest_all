package baekjoon._2411;

import java.util.Scanner;

public class _8393main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = (n * (n + 1)) / 2; // 1부터 n까지의 합 계산
        System.out.println(sum);
    }
}

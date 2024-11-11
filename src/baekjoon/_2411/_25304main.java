package baekjoon._2411;

import java.util.Scanner;

public class _25304main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt(); // 영수증에 적힌 총 금액 X
        int N = sc.nextInt(); // 영수증에 적힌 구매한 물건의 종류의 수 N

        int calculatedTotal = 0;

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt(); // 물건의 가격
            int b = sc.nextInt(); // 물건의 개수
            calculatedTotal += a * b; // 총 금액에 가격 * 개수를 더하기
        }

        if (calculatedTotal == X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
/*
준원이는 영수증을 보면서 정확하게 계산된 것이 맞는지 확인해보려 한다.

영수증에 적힌,
- 구매한 각 물건의 가격과 개수
- 구매한 물건들의 총 금액
을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자

첫째 줄에는 영수증에 적힌 총 금액 X 가 주어진다.
둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N 이 주어진다.
이후, N 개의 줄에는 각 물건의 가격 a 와 개수 b가 공백을 사이에 두고 주어진다.

구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 일치하지 않는다면 No를 출력한다.
 */
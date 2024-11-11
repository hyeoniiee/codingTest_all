package baekjoon;

import java.util.Scanner;

public class _2884main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        M -= 45; // 45분 앞당기기

        if (M < 0) {
            M += 60;
            H -= 1;
        } // 분이 0보다 작으면 시(hour)를 한 시간 줄이고, 분(minute)을 60분 추가

        if (H < 0) {
            H = 23;
        } // 시가 0보다 작아지면 23시로 설정 (하루 전으로 넘어감)

        System.out.println(H + " " + M);
    }
}

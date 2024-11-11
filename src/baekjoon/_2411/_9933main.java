package baekjoon._2411;

import java.util.ArrayList;

import java.util.Scanner;

public class _9933main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        //HashSet<String> password = new HashSet<>();
        ArrayList<String> password = new ArrayList<>();

//        for (int i = 0; i < N; i++) {
//            String pass = sc.nextLine();
//            String reversedPass = new StringBuilder(pass).reverse().toString();
//
//            if (password.contains(reversedPass)) {
//                int length = pass.length();
//                char middleChar = pass.charAt(length / 2);
//                System.out.println(length + " " + middleChar);
//                return;
//            }
//
//            password.add(pass);
//        }
        for (int i = 0; i < N; i++) {
            password.add(sc.nextLine());
        }

        for (String pass : password) {
            String reversedPass = new StringBuilder(pass).reverse().toString();
            if (password.contains(reversedPass) && !pass.equals(reversedPass)) {
                int length = pass.length();
                char middleChar = pass.charAt(length / 2);
                System.out.println(length + " " + middleChar);
                return;
            }
        }

        for (String pass : password) {
            String reversedPass = new StringBuilder(pass).reverse().toString();
            if (pass.equals(reversedPass)) {
                int length = pass.length();
                char middleChar = pass.charAt(length / 2);
                System.out.println(length + " " + middleChar);
                return;
            }
        }
    }
}

/*
문제
파일에는 단어가 한 줄에 하나씩 적혀있었고, 이 중 하나는 민균이가 온라인 저지에서 사용하는 비밀번호이다.
파일을 살펴보던 창영이는 모든 단어의 길이가 홀수라는 사실을 알아내었다.
민균이의 비밀번호는 목록에 포함되어 있으며, 비밀번호를 뒤집어서 쓴 문자열도 포함되어 있다.
예를 들어, 민균이의 비밀번호가 "tulipan" 인 경우에 목록에는 "napilut" 도 존재해야 한다.
알 수 없는 이유에 의해 모두 비밀번호로 사용 가능하다고 한다.
민균이의 파일에 적혀있는 단어가 모두 주어졌을 때, 비밀번호의 길이와 가운데 글자를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 단어의 수 N (2 ≤ N ≤ 100)이 주어진다.
다음 N개 줄에는 파일에 적혀있는 단어가 한 줄에 하나씩 주어진다.
단어는 알파벳 소문자로만 이루어져 있으며, 길이는 2보다 크고 14보다 작은 홀수이다.
 */
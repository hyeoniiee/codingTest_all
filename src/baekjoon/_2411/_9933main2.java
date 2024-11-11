package baekjoon._2411;

import java.util.HashMap;
import java.util.Scanner;

public class _9933main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        HashMap<String, Boolean> words = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String word = sc.nextLine();

            String reversedWord = new StringBuilder(word).reverse().toString();

            if (words.containsKey(reversedWord)) {
                int length = word.length();
                char middleChar = word.charAt(length / 2);
                System.out.println(length + " " + middleChar);
                return;
            }

            words.put(word, true);
        }

        for (String word : words.keySet()) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            if (word.equals(reversedWord)) { // 단어가 자기 자신과 역순일 경우
                int length = word.length();
                char middleChar = word.charAt(length / 2);
                System.out.println(length + " " + middleChar);
                return;
            }
        }
    }
}


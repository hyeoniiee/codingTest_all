import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체 생성 (입력을 받기 위해)
        Scanner sc = new Scanner(System.in);

        // 첫 번째 입력: 단어의 개수 N 입력
        int N = sc.nextInt();
        sc.nextLine(); // 개행 문자 제거

        // 단어들을 저장할 HashMap 생성
        HashMap<String, Boolean> words = new HashMap<>();

        // N개의 단어 입력 및 처리
        for (int i = 0; i < N; i++) {
            // 각 단어 입력
            String word = sc.nextLine();

            // 현재 단어의 역순을 생성
            String reversedWord = new StringBuilder(word).reverse().toString();

            // 역순 단어가 이미 존재하면 비밀번호로 판별
            if (words.containsKey(reversedWord)) {
                int length = word.length(); // 비밀번호의 길이
                char middleChar = word.charAt(length / 2); // 비밀번호의 가운데 글자
                System.out.println(length + " " + middleChar); // 결과 출력
                return; // 프로그램 종료
            }

            // 현재 단어를 HashMap에 추가
            words.put(word, true);
        }

        // 자기 자신과 역순 관계인 단어를 처리하기 위해 다시 한 번 탐색
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

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main(); // Main 클래스의 인스턴스를 생성 (현재 코드에서는 필요하지 않음)

        // 사용자 입력을 받기 위한 Scanner 객체 생성
        Scanner kb = new Scanner(System.in);

        // 사용자로부터 정수 n 입력 (데이터의 개수)
        int n = kb.nextInt();

        // 문자열과 정수 값을 저장할 HashMap 생성
        HashMap<String, Integer> map = new HashMap<>();

        // n번 반복하여 데이터 입력받기
        for (int i = 0; i < n; i++) {
            // 문자열과 정수 입력
            String a = kb.next(); // 문자열 입력
            int b = kb.nextInt(); // 정수 입력

            // HashMap에 값 추가: 기존 값이 있으면 기존 값에 b를 더하고, 없으면 기본값 0에 b를 더함
            map.put(a, map.getOrDefault(a, 0) + b);
        }

        // 초기 답변 설정 (기본적으로 "NO")
        String answer = "NO";

        // HashMap의 모든 키에 대해 값이 5인지 확인
        for (String key : map.keySet()) {
            // 값이 5인 경우 "YES"로 설정
            if (map.get(key) == 5) {
                answer = "YES";
                break; // 값이 5인 항목을 찾았으므로 반복문 종료
            }
        }

        // 결과 출력
        System.out.println(answer);
    }
}

문제 링크 : https://www.acmicpc.net/problem/27160
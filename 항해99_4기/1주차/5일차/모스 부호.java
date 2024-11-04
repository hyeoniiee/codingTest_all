import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 입력을 받기 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 입력: 메시지의 총 길이 (사용되지 않지만, 입력 형식에 포함됨)
        int N = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 제거를 위해 사용

        // 두 번째 입력: 모스 부호로 인코딩된 메시지
        String morseMessage = scanner.nextLine();

        // 모스 부호와 대응하는 문자 매핑을 위한 HashMap 생성
        Map<String, String> morseMap = new HashMap<>();
        morseMap.put(".-", "A"); morseMap.put("-...", "B"); morseMap.put("-.-.", "C");
        morseMap.put("-..", "D"); morseMap.put(".", "E"); morseMap.put("..-.", "F");
        morseMap.put("--.", "G"); morseMap.put("....", "H"); morseMap.put("..", "I");
        morseMap.put(".---", "J"); morseMap.put("-.-", "K"); morseMap.put(".-..", "L");
        morseMap.put("--", "M"); morseMap.put("-.", "N"); morseMap.put("---", "O");
        morseMap.put(".--.", "P"); morseMap.put("--.-", "Q"); morseMap.put(".-.", "R");
        morseMap.put("...", "S"); morseMap.put("-", "T"); morseMap.put("..-", "U");
        morseMap.put("...-", "V"); morseMap.put(".--", "W"); morseMap.put("-..-", "X");
        morseMap.put("-.--", "Y"); morseMap.put("--..", "Z");

        // 숫자에 대한 모스 부호 매핑
        morseMap.put(".----", "1"); morseMap.put("..---", "2"); morseMap.put("...--", "3");
        morseMap.put("....-", "4"); morseMap.put(".....", "5"); morseMap.put("-....", "6");
        morseMap.put("--...", "7"); morseMap.put("---..", "8"); morseMap.put("----.", "9");
        morseMap.put("-----", "0");

        // 구두점 및 특수 기호에 대한 모스 부호 매핑
        morseMap.put("--..--", ","); morseMap.put(".-.-.-", "."); morseMap.put("..--..", "?");
        morseMap.put("---...", ":"); morseMap.put("-....-", "-"); morseMap.put(".--.-.", "@");

        // 디코딩된 메시지를 저장할 StringBuilder 객체 생성
        StringBuilder decodedMessage = new StringBuilder();

        // 모스 부호 메시지를 공백을 기준으로 나누어 각 모스 부호로 배열 생성
        String[] morseCharacters = morseMessage.split(" ");

        // 각 모스 부호를 반복하여 해독
        for (String morseChar : morseCharacters) {
            // 해독된 문자를 StringBuilder에 추가 (HashMap에서 검색)
            decodedMessage.append(morseMap.get(morseChar));
        }

        // 해독된 메시지 출력
        System.out.println(decodedMessage.toString());
    }
}

문제 링크 : https://www.acmicpc.net/problem/29701
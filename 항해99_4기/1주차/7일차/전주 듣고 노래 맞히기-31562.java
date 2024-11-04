import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체 생성 (사용자 입력 받기 위해)
        Scanner sc = new Scanner(System.in);

        // N: 노래의 개수, M: 시도 횟수 입력
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine(); // 남은 개행 문자 제거

        // 노래의 첫 세 음과 제목을 매핑하는 HashMap 생성
        HashMap<String, List<String>> songMap = new HashMap<>();

        // N개의 노래 데이터 입력
        for (int i = 0; i < N; i++) {
            int T = sc.nextInt(); // 노래의 총 음표 수 (사용되지 않음)
            String title = sc.next(); // 노래 제목 입력
            String[] notes = new String[7]; // 첫 7개의 음을 저장할 배열

            // 7개의 음 입력
            for (int j = 0; j < 7; j++) {
                notes[j] = sc.next(); // 각 음 입력
            }

            // 첫 세 개의 음을 결합하여 키 생성
            String firstThreeNotes = notes[0] + notes[1] + notes[2];

            // 키가 없다면 빈 리스트로 초기화하고, 노래 제목 추가
            songMap.putIfAbsent(firstThreeNotes, new ArrayList<>());
            songMap.get(firstThreeNotes).add(title); // 해당 키에 제목 추가
        }

        // M개의 시도에 대해 처리
        for (int i = 0; i < M; i++) {
            String b1 = sc.next(); // 첫 번째 음
            String b2 = sc.next(); // 두 번째 음
            String b3 = sc.next(); // 세 번째 음

            // 시도한 세 음을 결합하여 키 생성
            String attempt = b1 + b2 + b3;

            // songMap에서 키가 존재하는지 확인
            if (songMap.containsKey(attempt)) {
                List<String> titles = songMap.get(attempt); // 해당 키의 노래 제목 리스트
                if (titles.size() == 1) {
                    // 리스트에 하나의 제목만 있으면 출력
                    System.out.println(titles.get(0));
                } else {
                    // 두 개 이상의 제목이 있으면 '?' 출력
                    System.out.println("?");
                }
            } else {
                // 키가 없으면 '!' 출력
                System.out.println("!");
            }
        }
    }
}

문제 링크 : https://www.acmicpc.net/problem/31562
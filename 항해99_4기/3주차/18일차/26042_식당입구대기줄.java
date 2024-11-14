// 문제 : https://www.acmicpc.net/problem/26042
// TIL : https://notes1615.tistory.com/entry/99%ED%81%B4%EB%9F%BD-%EC%BD%94%ED%85%8C-%EC%8A%A4%ED%84%B0%EB%94%94-18%EC%9D%BC%EC%B0%A8-TIL


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 정보의 개수
        Queue<Integer> queue = new LinkedList<>(); // 대기열을 나타내는 큐

        int maxQueueSize = 0; // 최대 대기 학생 수
        int minLastStudent = Integer.MAX_VALUE; // 최대 대기 학생 수에서의 맨 뒤 학생 번호

        // 각 정보를 처리
        for (int i = 0; i < n; i++) {
            int type = scanner.nextInt(); // 명령 유형

            if (type == 1) { // 유형 1: 학생 도착
                int student = scanner.nextInt(); // 학생 번호
                queue.add(student); // 큐의 맨 뒤에 학생 추가

                // 현재 대기 중인 학생 수와 맨 뒤 학생 번호 확인
                int queueSize = queue.size();
                int lastStudent = student; // 현재 맨 뒤에 있는 학생 번호는 방금 들어온 학생

                // 최대 대기 학생 수를 업데이트
                if (queueSize > maxQueueSize || (queueSize == maxQueueSize && lastStudent < minLastStudent)) {
                    maxQueueSize = queueSize;
                    minLastStudent = lastStudent;
                }

            } else if (type == 2) { // 유형 2: 식사 준비 완료
                if (!queue.isEmpty()) {
                    queue.poll(); // 큐의 맨 앞 학생 제거
                }
            }
        }

        // 결과 출력
        System.out.println(maxQueueSize + " " + minLastStudent);
        scanner.close();
    }
}

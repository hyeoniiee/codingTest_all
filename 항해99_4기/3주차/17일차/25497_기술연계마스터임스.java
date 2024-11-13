import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 기술의 개수
        String skill = sc.next(); // 기술 목록

        int cnt = 0; // 정상적으로 발동된 기술 횟수
        int lStack = 0; // 사전 기술 L의 사용 횟수
        int sStack = 0; // 사전 기술 S의 사용 횟수

        // 기술 목록을 하나씩 순회하며 정상 발동 여부 확인
        for (int i = 0; i < N; i++) {
            char currentSkill = skill.charAt(i); // 현재 기술

            // 각 기술별 처리
            if (currentSkill == 'L') { // 사전 기술 L
                lStack++; // L 사용 횟수 증가
            } else if (currentSkill == 'R') { // 본 기술 R
                if (lStack > 0) { // L의 사용 횟수가 0보다 크다면
                    cnt++; // 정상 발동 횟수 증가
                    lStack--; // L의 사용 횟수 감소, 연계 사용 완료
                } else {
                    break; // 연계 실패 시 종료
                }
            } else if (currentSkill == 'S') { // 사전 기술 S
                sStack++; // S 사용 횟수 증가
            } else if (currentSkill == 'K') { // 본 기술 K
                if (sStack > 0) { // S의 사용 횟수가 0보다 크다면
                    cnt++; // 정상 발동 횟수 증가
                    sStack--; // S의 사용 횟수 감소, 연계 사용 완료
                } else {
                    break; // 연계 실패 시 종료
                }
            } else { // 독립 기술 (1-9)
                cnt++; // 독립 기술은 연계 없이 발동 가능
            }
        }

        // 정상 발동 횟수 출력
        System.out.println(cnt);
    }
}

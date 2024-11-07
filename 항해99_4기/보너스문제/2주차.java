import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 입력: 출입 기록의 수 n
        int n = sc.nextInt();
        sc.nextLine(); // 개행 문자 제거

        // 사람의 이름과 출입 상태를 저장할 HashMap
        HashMap<String, String> log = new HashMap<>();

        // 출입 기록 처리
        for (int i = 0; i < n; i++) {
            String name = sc.next(); // 사람의 이름
            String status = sc.next(); // 출입 상태 (enter or leave)

            if (status.equals("enter")) {
                log.put(name, "enter"); // 출근 기록
            } else if (status.equals("leave")) {
                log.remove(name); // 퇴근 기록
            }
        }

        // 현재 회사에 남아있는 사람의 이름만 추출하여 리스트에 추가
        ArrayList<String> inOffice = new ArrayList<>();
        for (String name : log.keySet()) {
            if (log.get(name).equals("enter")) {
                inOffice.add(name);
            }
        }

        // 사전 역순으로 정렬
        inOffice.sort(Collections.reverseOrder());

        // 결과 출력
        for (String name : inOffice) {
            System.out.println(name);
        }
    }
}
// 문제 링크 : https://www.acmicpc.net/problem/7785
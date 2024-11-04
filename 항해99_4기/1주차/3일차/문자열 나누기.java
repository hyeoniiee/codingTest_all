class Solution {
    // 주어진 문자열 s를 특정 규칙에 따라 나눈 부분 문자열의 개수를 반환하는 메서드
    public int solution(String s) {
        int count = 0; // 나눈 부분 문자열의 개수를 저장하는 변수
        int xCount = 0; // 현재 부분 문자열에서 기준 문자인 x의 개수
        int otherCount = 0; // 현재 부분 문자열에서 x가 아닌 다른 문자들의 개수

        // 초기 기준 문자를 문자열의 첫 번째 문자로 설정
        char x = s.charAt(0);

        // 문자열의 각 문자를 순회
        for (int i = 0; i < s.length(); i++) {
            // 현재 문자가 기준 문자 x와 같으면 xCount 증가
            if (s.charAt(i) == x) {
                xCount++;
            } else {
                // 현재 문자가 x와 다르면 otherCount 증가
                otherCount++;
            }

            // xCount와 otherCount가 같으면 부분 문자열을 나눌 수 있음
            if (xCount == otherCount) {
                count++; // 나눌 수 있는 부분 문자열 개수 증가
                xCount = 0; // x의 개수 초기화
                otherCount = 0; // 다른 문자의 개수 초기화

                // 아직 문자열이 남아 있다면 다음 문자로 기준 문자 설정
                if (i + 1 < s.length()) {
                    x = s.charAt(i + 1);
                }
            }
        }

        // 루프가 끝났을 때 xCount나 otherCount가 남아 있으면, 마지막 부분 문자열로 처리
        if (xCount != 0 || otherCount != 0) {
            count++; // 남은 부분 문자열을 포함시킴
        }

        // 최종적으로 나눈 부분 문자열의 개수를 반환
        return count;
    }
}

문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/140108
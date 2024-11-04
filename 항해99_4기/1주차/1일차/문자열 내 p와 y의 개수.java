class Solution {
    // 메서드 정의: 문자열 s를 입력받아 'p'와 'y'의 개수가 같은지 확인하여 true 또는 false를 반환
    boolean solution(String s) {
        // 입력 문자열을 소문자로 변환하여 대소문자 구분 없이 처리
        s = s.toLowerCase();

        // 'p'와 'y'의 개수를 저장할 변수 초기화
        int pCount = 0;
        int yCount = 0;

        // 문자열의 각 문자에 대해 반복
        for (int i = 0; i < s.length(); i++) {
            // 현재 문자를 가져옴
            char ch = s.charAt(i);

            // 문자가 'p'인 경우 pCount 증가
            if (ch == 'p') {
                pCount++;
            }
            // 문자가 'y'인 경우 yCount 증가
            else if (ch == 'y') {
                yCount++;
            }
        }

        // 'p'와 'y'의 개수가 같은지 확인하여 true 또는 false 반환
        return pCount == yCount;
    }
}

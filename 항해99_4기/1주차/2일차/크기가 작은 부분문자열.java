class Solution {
    // 메서드 정의: 문자열 t에서 길이가 p와 같은 부분 문자열을 추출하여, 해당 부분 문자열이 p보다 작거나 같은 경우의 수를 반환
    public int solution(String t, String p) {
        int count = 0; // p보다 작거나 같은 부분 문자열의 개수를 세기 위한 변수
        int pLen = p.length(); // p의 길이를 저장
        long pNum = Long.parseLong(p); // p를 숫자로 변환하여 비교에 사용

        // 문자열 t에서 p의 길이만큼의 부분 문자열을 왼쪽에서부터 차례로 추출
        for (int i = 0; i <= t.length() - pLen; i++) {
            // 현재 인덱스 i부터 p의 길이만큼의 부분 문자열 추출
            String subStr = t.substring(i, i + pLen);

            // 추출한 부분 문자열을 숫자로 변환
            long subNum = Long.parseLong(subStr);

            // 부분 문자열의 숫자 값이 p의 숫자 값보다 작거나 같으면 카운트 증가
            if (subNum <= pNum) {
                count++;
            }
        }

        // 최종적으로 조건을 만족하는 부분 문자열의 개수를 반환
        return count;
    }
}

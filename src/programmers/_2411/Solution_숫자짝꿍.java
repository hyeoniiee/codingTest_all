package programmers._2411;

public class Solution_숫자짝꿍 {
    public String solution(String X, String Y) {
        // 두 문자열의 숫자 빈도수를 저장할 배열
        int[] countX = new int[10];
        int[] countY = new int[10];

        // X의 숫자 빈도수 계산
        for (char c : X.toCharArray()) {
            countX[c - '0']++;
        }

        // Y의 숫자 빈도수 계산
        for (char c : Y.toCharArray()) {
            countY[c - '0']++;
        }

        // 공통 숫자 추출 및 조합
        StringBuilder result = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            // 각 숫자의 최소 빈도만큼 추가
            int commonCount = Math.min(countX[i], countY[i]);
            for (int j = 0; j < commonCount; j++) {
                result.append(i);
            }
        }

        // 결과 처리
        if (result.length() == 0) {
            return "-1"; // 공통 숫자가 없을 경우
        }
        if (result.charAt(0) == '0') {
            return "0"; // 모든 숫자가 0인 경우
        }
        return result.toString(); // 공통 숫자로 구성된 가장 큰 숫자
    }
}

class Solution {
    // 메서드 정의: 문자열 s에 있는 영문 숫자 단어를 숫자로 변환하여 반환
    public int solution(String s) {
        // 영문 숫자 단어 배열 (0부터 9까지)
        String[] words = {"zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"};

        // 각 숫자 단어를 숫자로 변환하여 문자열 s에서 치환
        for (int i = 0; i < words.length; i++) {
            // 문자열 s에서 words[i]에 해당하는 단어를 숫자 i로 치환
            s = s.replaceAll(words[i], String.valueOf(i));
        }

        // 모든 치환이 완료된 후 문자열을 정수로 변환하여 반환
        return Integer.parseInt(s);
    }
}

문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/81301
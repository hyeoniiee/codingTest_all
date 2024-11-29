package baekjoon._2411;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _13419main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스 수 입력
        int T = Integer.parseInt(br.readLine().trim());

        // 각 테스트 케이스 처리
        for (int t = 0; t < T; t++) {
            String data = br.readLine().trim(); // 문자열 입력
            StringBuilder first = new StringBuilder();
            StringBuilder second = new StringBuilder();

            // 문자열 분리
            for (int i = 0; i < data.length(); i++) {
                if (i % 2 == 0) {
                    first.append(data.charAt(i));
                } else {
                    second.append(data.charAt(i));
                }
            }

            // 문자열 길이가 홀수일 경우 처리
            if (data.length() % 2 == 1) {
                String copy = first.toString(); // first 문자열 복사
                first.append(second);          // first에 second 이어붙임
                second.append(copy);           // second에 복사된 first 이어붙임
            }

            // 결과 출력
            System.out.println(first);
            System.out.println(second);
        }
    }
}

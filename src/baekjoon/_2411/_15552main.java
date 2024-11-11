package baekjoon._2411;

import java.io.*;

public class _15552main {
    public static void main(String[] args) throws IOException {
        // BufferedReader와 BufferedWriter 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 번째 줄에서 테스트 케이스 개수 T 입력받기
        int T = Integer.parseInt(br.readLine());

        // T개의 테스트 케이스를 처리
        for (int i = 0; i < T; i++) {
            // 각 줄의 입력을 받아 공백을 기준으로 나누기
            String[] inputs = br.readLine().split(" ");
            int A = Integer.parseInt(inputs[0]);
            int B = Integer.parseInt(inputs[1]);

            // A + B의 결과를 버퍼에 저장
            bw.write((A + B) + "\n");
        }

        // 모든 출력을 한 번에 수행
        bw.flush();
    }
}

package baekjoon._2411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10818main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 정수의 개수 N 입력받기
        int N = Integer.parseInt(br.readLine());

        // N개의 정수를 입력받아 최솟값과 최댓값 찾기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        // 최솟값과 최댓값 출력
        System.out.println(min + " " + max);
    }
}

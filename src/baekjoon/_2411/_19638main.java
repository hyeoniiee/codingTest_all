package baekjoon._2411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class _19638main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 거인의 수
        int Hcenti = Integer.parseInt(st.nextToken()); // 센티의 키
        int T = Integer.parseInt(st.nextToken()); // 뿅망치 사용 가능 횟수

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            maxHeap.add(Integer.parseInt(br.readLine()));
        }
        int hammerCount = 0;

        while (T > 0 && !maxHeap.isEmpty()) {
            int tallest = maxHeap.poll();
            if (tallest < Hcenti) {
                maxHeap.add(tallest);
                break;
            }

            if (tallest == 1) {
                maxHeap.add(tallest);
                break;
            }

            maxHeap.add(tallest / 2);

            hammerCount++;
            T--;
        }

        if (maxHeap.peek() < Hcenti) {
            System.out.println("YES");
            System.out.println(hammerCount);
        } else {
            System.out.println("NO");
            System.out.println(maxHeap.peek());
        }

    }
}

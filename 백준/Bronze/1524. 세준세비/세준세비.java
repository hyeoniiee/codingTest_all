import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        for (int t = 0; t < T; t++) {
            br.readLine(); 
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            PriorityQueue<Integer> sj = new PriorityQueue<>();
            for (int i = 0; i < N; i++) {
                sj.offer(Integer.parseInt(st.nextToken()));
            }

            st = new StringTokenizer(br.readLine());
            PriorityQueue<Integer> sb = new PriorityQueue<>();
            for (int i = 0; i < M; i++) {
                sb.offer(Integer.parseInt(st.nextToken()));
            }

            while (!sj.isEmpty() && !sb.isEmpty()) {
                if (sj.peek() >= sb.peek()) { 
                    sb.poll(); 
                } else {
                    sj.poll(); 
                }
            }

            if (!sj.isEmpty()) {
                System.out.println("S"); 
            } else if (!sb.isEmpty()) {
                System.out.println("B");
            } else {
                System.out.println("C"); 
            }
        }
    }
}

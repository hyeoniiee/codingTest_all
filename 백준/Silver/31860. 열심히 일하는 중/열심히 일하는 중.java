import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            int D = Integer.parseInt(br.readLine());
            pq.add(D);
        }

        int days = 0; 
        int satisfaction = 0;
        StringBuilder sb = new StringBuilder(); 
        
        while (!pq.isEmpty()) {
            int currTask = pq.poll(); 
            
            satisfaction = (satisfaction / 2) + currTask;
            sb.append(satisfaction).append("\n"); 

            currTask -= M;
            if (currTask > K) {
                pq.add(currTask);
            }

            days++;
        }

        System.out.println(days);
        System.out.print(sb.toString());
    }
}

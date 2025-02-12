import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder(); 
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); 

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()); 

            if (a == 0) {
                if (maxHeap.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(maxHeap.poll()).append("\n"); 
                }
            } else { 
                while (st.hasMoreTokens()) {
                    maxHeap.add(Integer.parseInt(st.nextToken())); 
                }
            }
        }

        System.out.print(sb.toString()); 
    }
}

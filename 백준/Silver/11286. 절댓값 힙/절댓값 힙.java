import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); 

        PriorityQueue<Integer> absHeap = new PriorityQueue<>((a, b) -> {
            int absA = Math.abs(a);
            int absB = Math.abs(b);
            if (absA == absB) return a - b; 
            return absA - absB; 
        });

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0) { 
                if (absHeap.isEmpty()) sb.append("0\n");
                else sb.append(absHeap.poll()).append("\n");
            } else {
                absHeap.add(x);
            }
        }

        System.out.print(sb.toString());
    }
}

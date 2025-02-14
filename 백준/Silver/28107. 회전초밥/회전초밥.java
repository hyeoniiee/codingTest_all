import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<Integer, Queue<Integer>> sushiMap = new HashMap<>();
        int[] result = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken()); 

            for (int j = 0; j < k; j++) {
                int sushi = Integer.parseInt(st.nextToken());
                sushiMap.putIfAbsent(sushi, new LinkedList<>());
                sushiMap.get(sushi).add(i); 
            }
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int sushi = Integer.parseInt(st.nextToken());

            if (sushiMap.containsKey(sushi)) {
                Queue<Integer> queue = sushiMap.get(sushi);
                if (!queue.isEmpty()) {
                    int customer = queue.poll(); 
                    result[customer]++; 
                }
                
                if (queue.isEmpty()) {
                    sushiMap.remove(sushi);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int count : result) {
            sb.append(count).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}

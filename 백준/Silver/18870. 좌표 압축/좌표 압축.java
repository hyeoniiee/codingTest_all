import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] original = new int[N];
        int[] sorted = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            original[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sorted);
        Map<Integer, Integer> compressedMap = new HashMap<>();
        int index = 0;

        for (int num : sorted) {
            if (!compressedMap.containsKey(num)) { 
                compressedMap.put(num, index++);
            }
        }

        for (int i = 0; i < N; i++) {
            bw.write(compressedMap.get(original[i]) + " ");
        }
        
        bw.flush();
        bw.close();
    }
}

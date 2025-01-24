import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 수업 수
        int M = Integer.parseInt(st.nextToken()); // 최소 수업 기준

        HashMap<String, Integer> studentCount = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int K = Integer.parseInt(br.readLine()); 
            st = new StringTokenizer(br.readLine());
            
            for (int j = 0; j < K; j++) {
                String studentId = st.nextToken();
                studentCount.put(studentId, studentCount.getOrDefault(studentId, 0) + 1);
            }
        }

        int result = 0;
        for (int count : studentCount.values()) {
            if (count >= M) {
                result++;
            }
        }

        System.out.println(result);
    }
}

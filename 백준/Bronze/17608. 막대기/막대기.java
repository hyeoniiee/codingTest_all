import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); 

        int[] heights = new int[N]; 
        
        for (int i = 0; i < N; i++) {
            heights[i] = Integer.parseInt(br.readLine());
        }

        int visibleCount = 0; 
        int maxHeight = 0; 
        
        for (int i = N - 1; i >= 0; i--) {
            if (heights[i] > maxHeight) { 
                visibleCount++;
                maxHeight = heights[i]; 
            }
        }

        System.out.println(visibleCount);
    }
}

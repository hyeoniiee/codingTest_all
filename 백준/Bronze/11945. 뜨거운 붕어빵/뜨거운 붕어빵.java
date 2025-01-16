import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] dimensions = br.readLine().split(" "); 
        int N = Integer.parseInt(dimensions[0]); 
        int M = Integer.parseInt(dimensions[1]); 

        String[] fishShape = new String[N];

        for (int i = 0; i < N; i++) {
            fishShape[i] = br.readLine(); 
        }

        for (int i = 0; i < N; i++) {
            String reversedRow = new StringBuilder(fishShape[i]).reverse().toString();
            System.out.println(reversedRow);
        }
    }
}
   
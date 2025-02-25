import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); 
        
        int original = N; 
        int count = 0; 

        do {
            int A = N / 10;
            int B = N % 10;
            int sum = A + B;
            
            N = (B * 10) + (sum % 10);
            count++;
        } while (N != original);

        System.out.println(count);
    }
}

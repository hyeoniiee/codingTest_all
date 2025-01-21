import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int L = Integer.parseInt(br.readLine());
        
        String input = br.readLine();
        
        int r = 31;
        int M = 1234567891;
        
        long hashValue = 0;
        
        long power = 1;
        
        for (int i = 0; i < L; i++) {
            int charValue = input.charAt(i) - 'a' + 1; 
            hashValue = (hashValue + charValue * power) % M; 
            power = (power * r) % M; 
        }

        System.out.println(hashValue);
    }
}

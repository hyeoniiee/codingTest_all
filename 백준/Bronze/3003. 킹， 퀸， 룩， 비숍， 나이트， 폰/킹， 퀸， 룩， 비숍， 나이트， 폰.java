import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] standardPieces = {1, 1, 2, 2, 2, 8};
        
        String[] input = br.readLine().split(" ");
        int[] foundPieces = new int[6];
        for (int i = 0; i < 6; i++) {
            foundPieces[i] = Integer.parseInt(input[i]);
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            result.append(standardPieces[i] - foundPieces[i]).append(" ");
        }
        
        System.out.println(result.toString().trim());
    }
}

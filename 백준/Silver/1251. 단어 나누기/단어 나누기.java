import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int length = word.length();

        String result = null;
        
        for (int i = 1; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                String part1 = word.substring(0, i);
                String part2 = word.substring(i, j);
                String part3 = word.substring(j);

                String reversed = new StringBuilder(part1).reverse()
                        .append(new StringBuilder(part2).reverse())
                        .append(new StringBuilder(part3).reverse())
                        .toString();

                if (result == null || reversed.compareTo(result) < 0) {
                    result = reversed;
                }
            }
        }

        System.out.println(result);
    }
}

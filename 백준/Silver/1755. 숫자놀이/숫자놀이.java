import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static final String[] NUM_TO_WORD = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        List<String[]> numbers = new ArrayList<>();
        for (int i = M; i <= N; i++) {
            numbers.add(new String[]{toEnglish(i), String.valueOf(i)});
        }

        numbers.sort(Comparator.comparing(a -> a[0]));

        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (String[] num : numbers) {
            sb.append(num[1]).append(" "); 
            count++;
            if (count % 10 == 0) sb.append("\n");
        }

        System.out.print(sb.toString().trim());
    }

    private static String toEnglish(int num) {
        StringBuilder sb = new StringBuilder();
        for (char ch : String.valueOf(num).toCharArray()) {
            sb.append(NUM_TO_WORD[ch - '0']).append(" ");
        }
        return sb.toString().trim();
    }
}

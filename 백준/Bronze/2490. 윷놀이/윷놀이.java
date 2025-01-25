import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int zeroCount = 0;

            for (int j = 0; j < 4; j++) {
                int state = Integer.parseInt(st.nextToken());
                if (state == 0) {
                    zeroCount++;
                }
            }
            
            switch (zeroCount) {
                case 1:
                    System.out.println("A"); // 도
                    break;
                case 2:
                    System.out.println("B"); // 개
                    break;
                case 3:
                    System.out.println("C"); // 걸
                    break;
                case 4:
                    System.out.println("D"); // 윷
                    break;
                case 0:
                    System.out.println("E"); // 모
                    break;
            }
        }
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            String maxSchool = "";
            int maxConsumption = 0;

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String school = st.nextToken();
                int consumption = Integer.parseInt(st.nextToken());

                if (consumption > maxConsumption) {
                    maxConsumption = consumption;
                    maxSchool = school;
                }
            }

            System.out.println(maxSchool);
        }
    }
}
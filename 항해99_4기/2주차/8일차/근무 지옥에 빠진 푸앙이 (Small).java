import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> workTime = new HashMap<>();

        int[] shiftTimes = {4, 6, 4, 10};

        for (int week = 0; week < n; week++) {
            for (int day = 0; day < 7; day++) {
                for (int shift = 0; shift < 4; shift++) {
                    String line = br.readLine();

                    if (line == null || line.isEmpty()) {
                        continue;
                    }

                    StringTokenizer st = new StringTokenizer(line);
                    while (st.hasMoreTokens()) {
                        String worker = st.nextToken();
                        if (!worker.equals("-")) {
                            workTime.put(worker, workTime.getOrDefault(worker, 0) + shiftTimes[shift]);
                        }
                    }
                }
            }
        }

        if (workTime.isEmpty()) {
            System.out.println("Yes");
            return;
        }

        int maxTime = Collections.max(workTime.values());
        int minTime = Collections.min(workTime.values());

        if (maxTime - minTime <= 12) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

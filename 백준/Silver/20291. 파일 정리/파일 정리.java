import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> extensionCount = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            String exten = name.split("\\.")[1];

            extensionCount.put(exten, extensionCount.getOrDefault(exten, 0) + 1);
        }

        List<String> sortedExtensions = new ArrayList<>(extensionCount.keySet());
        Collections.sort(sortedExtensions);

        StringBuilder sb = new StringBuilder();
        for (String ext : sortedExtensions) {
            sb.append(ext).append(" ").append(extensionCount.get(ext)).append("\n");
        }
        System.out.print(sb);
    }
}

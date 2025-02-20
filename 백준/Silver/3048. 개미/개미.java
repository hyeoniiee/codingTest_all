import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        int N1 = Integer.parseInt(input[0]);
        int N2 = Integer.parseInt(input[1]);

        StringBuilder firstGroup = new StringBuilder(br.readLine()).reverse();
        String secondGroup = br.readLine();

        StringBuilder ants = new StringBuilder(firstGroup.toString() + secondGroup);

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            for (int i = 0; i < ants.length() - 1; i++) {
                if (firstGroup.indexOf(String.valueOf(ants.charAt(i))) != -1 &&
                    secondGroup.indexOf(String.valueOf(ants.charAt(i + 1))) != -1) {
                    
                    char temp = ants.charAt(i);
                    ants.setCharAt(i, ants.charAt(i + 1));
                    ants.setCharAt(i + 1, temp);

                    i++;
                }
            }
        }

        System.out.println(ants);
    }
}

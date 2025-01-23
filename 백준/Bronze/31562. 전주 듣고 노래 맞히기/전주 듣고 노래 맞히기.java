import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine(); 

        HashMap<String, List<String>> songMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int T = sc.nextInt();
            String title = sc.next(); 
            String[] notes = new String[7];

            for (int j = 0; j < 7; j++) {
                notes[j] = sc.next();
            }
            
            String firstThreeNotes = notes[0] + notes[1] + notes[2];

            songMap.putIfAbsent(firstThreeNotes, new ArrayList<>());
            songMap.get(firstThreeNotes).add(title);
        }

        for (int i = 0; i < M; i++) {
            String b1 = sc.next();
            String b2 = sc.next();
            String b3 = sc.next();

            String attempt = b1 + b2 + b3;

            if (songMap.containsKey(attempt)) {
                List<String> titles = songMap.get(attempt);
                if (titles.size() == 1) {
                    System.out.println(titles.get(0));
                } else {
                    System.out.println("?"); 
                }
            } else {
                System.out.println("!");
            }
        }
    }
}

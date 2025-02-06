import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); 

        Deque<int[]> queue = new LinkedList<>(); 
        TreeSet<Integer> A = new TreeSet<>(); 
        TreeSet<Integer> B = new TreeSet<>(); 
        TreeSet<Integer> C = new TreeSet<>(); 

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());

            if (type == 1) { 
                int studentId = Integer.parseInt(st.nextToken());
                int favoriteMenu = Integer.parseInt(st.nextToken());
                queue.addLast(new int[]{studentId, favoriteMenu});
            } else if (type == 2) { 
                int menu = Integer.parseInt(st.nextToken());
                if (!queue.isEmpty()) {
                    int[] student = queue.pollFirst(); 
                    int studentId = student[0];
                    int favoriteMenu = student[1];

                    if (favoriteMenu == menu) {
                        A.add(studentId); 
                    } else {
                        B.add(studentId); 
                    }
                }
            }
        }

        while (!queue.isEmpty()) {
            C.add(queue.pollFirst()[0]);
        }

        printSet(A);
        printSet(B);
        printSet(C);
    }
    
    private static void printSet(TreeSet<Integer> set) {
        if (set.isEmpty()) {
            System.out.println("None");
        } else {
            StringBuilder sb = new StringBuilder();
            for (int num : set) {
                sb.append(num).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}

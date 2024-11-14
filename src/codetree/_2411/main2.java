package codetree._2411;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder s = new StringBuilder();
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int queryType = sc.nextInt();
            if (queryType == 1) {
                int a = sc.nextInt() -1;
                int b = sc.nextInt() -1;

                char temp = s.charAt(a);
                s.setCharAt(a, s.charAt(b));
                s.setCharAt(b, temp);

                System.out.println(s);
            } else if (queryType == 2) {
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);

                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == a) {
                        s.setCharAt(j, b);
                    }
                }
                System.out.println(s);
            }
        }
    }
}

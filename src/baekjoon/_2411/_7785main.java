package baekjoon._2411;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class _7785main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        HashMap<String, String> log = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String status = sc.next();

            if (status.equals("enter")) {
                log.put(name, "enter");
            } else if (status.equals("leave")) {
                log.remove(name);
            }
        }

        ArrayList<String> inOffice = new ArrayList<>();
        for (String name : log.keySet()) {
            if (log.get(name).equals("enter")) {
                inOffice.add(name);
            }
        }

        inOffice.sort(Collections.reverseOrder());

        for (String name : inOffice) {
            System.out.println(name);
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        ArrayList<String> password = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            password.add(sc.nextLine());
        }

        for (String pass : password) {
            String reversedPass = new StringBuilder(pass).reverse().toString();
            if (password.contains(reversedPass) && !pass.equals(reversedPass)) {
                int length = pass.length();
                char middleChar = pass.charAt(length / 2);
                System.out.println(length + " " + middleChar);
                return;
            }
        }

        for (String pass : password) {
            String reversedPass = new StringBuilder(pass).reverse().toString();
            if (pass.equals(reversedPass)) {
                int length = pass.length();
                char middleChar = pass.charAt(length / 2);
                System.out.println(length + " " + middleChar);
                return;
            }
        }
    }
}

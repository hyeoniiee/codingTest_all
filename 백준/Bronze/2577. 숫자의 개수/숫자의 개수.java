import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int result = A * B * C;

        int[] count = new int[10];

        while (result > 0) {
            int digit = result % 10;
            count[digit]++;
            result /= 10;
        }

        for (int counts : count) {
            System.out.println(counts);
        }
    }
}

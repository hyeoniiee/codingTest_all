import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); 
        String skill = scanner.next(); 

        int cnt = 0; 
        int Ls = 0; 
        int Ss = 0;

        for (int i = 0; i < N; i++) {
            char currentSkill = skill.charAt(i);

            if (currentSkill == 'L') {
                Ls++;
            } else if (currentSkill == 'R') {
                if (Ls > 0) { 
                    cnt++;
                    Ls--;
                } else {
                    break;
                }
            } else if (currentSkill == 'S') { 
                Ss++;
            } else if (currentSkill == 'K') { 
                if (Ss > 0) { 
                    cnt++;
                    Ss--; 
                } else {
                    break;
                }
            } else {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}

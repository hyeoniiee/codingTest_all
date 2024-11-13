package baekjoon._2411;

import java.util.Scanner;

public class _25497main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String skill = sc.next();

        int cnt = 0;
        int lStack = 0;
        int sStack = 0;

        for (int i = 0; i < N; i++) {
            char currentSkill = skill.charAt(i);

            if (currentSkill == 'L') {
                lStack++;
            } else if (currentSkill == 'R') {
                if (lStack > 0) {
                    cnt++;
                    lStack--;
                } else {
                    break;
                }
            } else if (currentSkill == 'S') {
                sStack++;
            } else if (currentSkill == 'K') {
                if (sStack > 0) {
                    cnt++;
                    sStack--;
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
/*
연계 기술은 사전 기술과 본 기술의 두 개의 개별 기술을 순서대로 사용해야만 정상적으로 사용 가능한 기술을 말한다.
하나의 사전 기술은 하나의 본 기술과만 연계해서 사용할 수 있으며, 연계할 사전 기술 없이 본 기술을 사용했을 경우에는 게임의 스크립트가 꼬여서 이후 사용하는 기술들이 정상적으로 발동되지 않는다.
그렇지만 반드시 사전 기술을 사용한 직후에 본 기술을 사용할 필요는 없으며, 중간에 다른 기술을 사용하여도 연계는 정상적으로 이루어진다.
임스가 사용할 수 있는 기술에는 1 ~ 9, L, S, K 가 있다.
1 ~ 9 는 연계 없이 사용할 수 있는 기술이고, L 은 R 의 사전 기술, S 은 K 의 사전 기술이다.

임스가 정해진 순서대로 N개의 기술을 사용할 때, 기술이 몇 번이나 정상적으로 발동하는지를 구해보자.
단, 연계 기술은 사전 기술과 본 기술 모두 정상적으로 발동되었을 때만 하나의 기술이 발동된 것으로 친다.

첫 번째 줄에는 총 기술 사용 횟수 N이 주어진다.
두 번째 줄에는 임스가 사용할 N개의 기술이 공백 없이 주어진다.

임스가 정상적으로 기술을 사용한 총 횟수를 출력한다.
 */
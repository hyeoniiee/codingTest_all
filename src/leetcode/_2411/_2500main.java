package leetcode._2411;

import java.util.Arrays;

public class _2500main {
    public static int deleteGreatestValue(int[][] grid) {
        int m = grid.length; // 행의 개수
        int n = grid[0].length; // 열의 개수
        int answer = 0; // 최종 결과값

        // 1. 각 행을 내림차순으로 정렬
        for (int i = 0; i < m; i++) {
            Arrays.sort(grid[i]); // 각 행을 정렬 (오름차순)
            reverseArray(grid[i]); // 정렬 후 뒤집어서 내림차순으로 만듦
        }

        // 2. 열의 수만큼 반복
        for (int col = 0; col < n; col++) {
            int maxInThisRound = 0; // 현재 라운드에서 제거된 값 중 최대값
            for (int row = 0; row < m; row++) {
                maxInThisRound = Math.max(maxInThisRound, grid[row][col]); // 각 행의 col번째 값을 비교
            }
            answer += maxInThisRound; // 이번 라운드의 최대값을 결과에 더함
        }

        return answer; // 최종 결과 반환
    }

    // 배열을 뒤집는 함수 (오름차순 배열을 내림차순으로 변환)
    private static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[][] grid1 = {{1, 2, 4}, {3, 3, 1}};
        System.out.println(deleteGreatestValue(grid1)); // 출력: 8

//        int[][] grid2 = {{10}};
//        System.out.println(deleteGreatestValue(grid2)); // 출력: 10
    }

}

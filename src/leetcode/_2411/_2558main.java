package leetcode._2411;

import java.util.PriorityQueue;

public class _2558main {
    public static long pickGifts(int[] gifts, int k) {
        // 최대 힙 생성 (내림차순으로 정렬)
        PriorityQueue<Long> maxHeap = new PriorityQueue<>((a, b) -> Long.compare(b, a));

        // 모든 선물을 힙에 삽입
        for (int gift : gifts) {
            maxHeap.add((long) gift); // int를 long으로 변환하여 저장
        }

        // k번 반복하여 가장 큰 더미의 선물을 처리
        for (int i = 0; i < k; i++) {
            if (!maxHeap.isEmpty()) {
                long largest = maxHeap.poll(); // 가장 큰 값을 가져옴
                long remaining = (long) Math.floor(Math.sqrt(largest)); // 제곱근의 바닥값 계산
                maxHeap.add(remaining); // 남은 선물을 힙에 다시 삽입
            }
        }

        // 남은 모든 선물의 합 계산
        long totalGifts = 0;
        while (!maxHeap.isEmpty()) {
            totalGifts += maxHeap.poll(); // 합산 (long 사용)
        }

        return totalGifts;
    }

    public static void main(String[] args) {
        // 예제 1
        int[] gifts1 = {25, 64, 9, 4, 100}; // 선물 더미
        int k1 = 4; // 처리 횟수
        System.out.println(pickGifts(gifts1, k1)); // 결과: 29

//        // 예제 2
//        int[] gifts2 = {1, 1, 1, 1}; // 모든 더미가 1개
//        int k2 = 4; // 처리 횟수
//        System.out.println(pickGifts(gifts2, k2)); // 결과: 4
//
//        // 예제 3 (큰 값 테스트)
//        int[] gifts3 = {1_000_000_000, 1_000_000_000, 1_000_000_000}; // 큰 값
//        int k3 = 630; // 처리 횟수
//        System.out.println(pickGifts(gifts3, k3)); // 테스트 결과 확인
    }
}

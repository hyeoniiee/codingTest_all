import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        
        for (int s : scoville) {
            heap.add(s);
        }
        
        int mixCount = 0; 
        
        while (heap.size() > 1) {
            int first = heap.poll(); 
            if (first >= K) {
                return mixCount; 
            }
            int second = heap.poll();  
            int newScoville = first + (second * 2); 
            heap.add(newScoville); 
            mixCount++; 
        }
        
        return heap.poll() >= K ? mixCount : -1;
    }
}
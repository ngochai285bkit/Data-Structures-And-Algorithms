package _6_Stack_And_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class _933_Number_of_Recent_Calls {
    static class RecentCounter {
        private Queue<Integer> queue = new LinkedList<>();

        public RecentCounter() {
            
        }
        
        public int ping(int t) {
            queue.add(t);
            while(queue.peek()<(t-3000)){
                queue.poll();
            }
            return queue.size();
        }
    }

    public static void main(String[] args) {
        
    }
}

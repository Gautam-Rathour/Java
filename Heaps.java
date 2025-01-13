import java.util.PriorityQueue;
public class Heaps {
    public static void main(String args[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(3); // O(log n)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()) {
            System.out.print(pq.peek() + " "); // O(1)
            pq.remove(); // O(log n)
        }
    }
}

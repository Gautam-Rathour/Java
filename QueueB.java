// =======================================================================================================
// =======================================================================================================

public class QueueB {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1
        }
        public static boolean isEmpty() {
            return rear == -1;
        }

        // add
        public static void arr(int data) {
            if(rear == size-1) {
                System.out.println("Queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        //remove
        public static void remove() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
            }
        }
    }
    public static void main (String args[]) {
        
    }
}

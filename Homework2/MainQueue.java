public class MainQueue {
    public static void main(String[] args) {
        MyQueue queue1 = new MyQueue();
        queue1.enqueue(1);
        queue1.enqueue(3);
        queue1.enqueue(5);
        queue1.enqueue(7);

        MyQueue queue2 = new MyQueue();
        queue2.enqueue(2);
        queue2.enqueue(4);
        queue2.enqueue(6);
        queue2.enqueue(8);

        MyQueue merged = MergeQueues.merge(queue1, queue2);

        System.out.print("Объединённая очередь: ");
        while (!merged.isEmpty()) {
            System.out.print(merged.dequeue() + " ");
        }
    }
}

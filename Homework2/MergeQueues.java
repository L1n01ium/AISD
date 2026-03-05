public class MergeQueues {
    public static MyQueue merge(MyQueue q1, MyQueue q2) {
        MyQueue result = new MyQueue();

        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (q1.peek() <= q2.peek()) {
                result.enqueue(q1.dequeue());
            } else {
                result.enqueue(q2.dequeue());
            }
        }

        while (!q1.isEmpty()) {
            result.enqueue(q1.dequeue());
        }

        while (!q2.isEmpty()) {
            result.enqueue(q2.dequeue());
        }

        return result;
    }
}

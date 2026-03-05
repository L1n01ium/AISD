public class MyQueue {
    private Node head;
    private Node tail;

    public MyQueue() {
        head = null;
        tail = null;
    }
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return head.value;
    }

    public boolean isEmpty() {
        return head == null;
    }
}

public class MyStack {
    private Node top;

    public MyStack() {
        top = null;
    }

    // Добавление элемента на вершину
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    // Удаление и возврат элемента с вершины
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        int value = top.value;
        top = top.next;
        return value;
    }

    // Проверка, пуст ли стек
    public boolean isEmpty() {
        return top == null;
    }
}

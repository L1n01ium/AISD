public class Calculator {
    public static int evaluate(String expression) {
        String[] tokens = expression.split(" ");
        MyStack stack = new MyStack();

        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    int subtrahend = stack.pop();
                    int minuend = stack.pop();
                    stack.push(minuend - subtrahend);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                default:
                    // Число
                    stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}

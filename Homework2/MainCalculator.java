public class MainCalculator {
    public static void main(String[] args) {
        String input = "3 4 + 5 *";  // (3+4)*5 = 35
        System.out.println("Результат: " + Calculator.evaluate(input));
    }
}

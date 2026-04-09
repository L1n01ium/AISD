public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9};
        int goal = 6;
        int result = numbers.length - 1;
        for (int idx = 0; idx < numbers.length; idx++) {
            if (numbers[idx] > goal) {
                result = idx - 1;
                break;
            }
        }
        System.out.println(result);
    }
}

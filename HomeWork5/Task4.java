import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] test1 = {1, 4, 7, 2};
        int[] test2 = {3, 30, 34, 5, 9};
        int[] test3 = {10, 2};

        System.out.println(buildMaxNumber(test1));
        System.out.println(buildMaxNumber(test2));
        System.out.println(buildMaxNumber(test3));
    }

    public static String buildMaxNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return "";
        }

        String[] asStrings = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            asStrings[i] = Integer.toString(numbers[i]);
        }

        Arrays.sort(asStrings, (a, b) -> (b + a).compareTo(a + b));

        if (asStrings[0].equals("0")) {
            return "0";
        }

        String result = "";
        for (String s : asStrings) {
            result = result + s;
        }
        return result;
    }
}

import java.util.Arrays;
import java.util.Comparator;

public class Task2 {
    public static void main(String[] args) {
        String[] words = {"Cat", "dog", "cat", "DOG", "mouse", "Mouse", "Zebra"};

        Arrays.sort(words, Comparator.comparing(String::toLowerCase));

        for (String w : words) {
            System.out.print(w + " ");
        }
        System.out.println();
    }
}
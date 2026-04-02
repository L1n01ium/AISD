import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        int[] data = {3, 6, 8, 12, 5};
        int target = 11;

        Map<Integer, Integer> seen = new HashMap<>();

        for (int idx = 0; idx < data.length; idx++) {
            int current = data[idx];
            int need = target - current;

            if (seen.containsKey(need)) {
                System.out.println(need + " + " + current + " = " + target);
                return;
            }
            seen.put(current, idx);
        }
        System.out.println("Подходящих чисел нет");
    }
}
import java.util.HashSet;
import java.util.Set;

public class Task6 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {1, 3, 5};
        int[] c = {1, 5, 6, 7, 8, 10, 9};

        Set<Integer> setA = new HashSet<>();
        for (int num : a) {
            setA.add(num);
        }

        Set<Integer> setB = new HashSet<>();
        for (int num : b) {
            setB.add(num);
        }

        Set<Integer> setC = new HashSet<>();
        for (int num : c) {
            setC.add(num);
        }

        setA.retainAll(setB);
        setA.retainAll(setC);

        System.out.println(setA);
    }
}
public class task2 {
    public static int findNumber(int[] arr) {
        int n = arr.length;
        long maybeSum = (long) n * (n + 1) / 2;
        long actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += i;
        }
        return (int) (maybeSum - actualSum);
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 4, 2};
        System.out.println(findNumber(arr));
    }
}

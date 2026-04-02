public class Task3 {
    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11};
        int targetSum = 12;

        findPair(sortedArray, targetSum);
    }

    private static void findPair(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (currentSum == target) {
                System.out.println(arr[left] + " " + arr[right]);
                return;
            }
            if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("Ни одной пары не найдено");
    }
}

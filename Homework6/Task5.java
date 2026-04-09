import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] nums = {1, 4, 7, 10, 13, 16, 19};
        int targetVal = 32;
        int answer = findClosestSum(nums, targetVal);
        System.out.println(answer);
    }

    static int findClosestSum(int[] a, int t) {
        int best = a[0] + a[1] + a[2];
        int diff = Math.abs(best - t);
        for (int i = 0; i < a.length - 2; i++) {
            int l = i + 1;
            int r = a.length - 1;
            while (l < r) {
                int cur = a[i] + a[l] + a[r];
                int curDiff = Math.abs(cur - t);
                if (curDiff < diff) {
                    best = cur;
                    diff = curDiff;
                }
                if (cur < t) {
                    l++;
                } else if (cur > t) {
                    r--;
                } else {
                    return cur; // точно совпало
                }
            }
        }
        return best;
    }
}
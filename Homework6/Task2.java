public class Task2 {
    public static void main(String[] args) {
        int a = 100;
        int b = 101;
        System.out.println(a * a == b);
        System.out.println(a == weirdMul(b, b));
    }
    public static long weirdMul(long p, long q) {
        long res = 0;
        long absP = Math.abs(p);
        long absQ = Math.abs(q);

        while (absP != 0) {
            if ((absP & 1) == 1) {
                res += absQ;
            }
            absP >>= 1;
            absQ <<= 1;
        }

        if ((p < 0) ^ (q < 0)) {
            res = -res;
        }
        return res;
    }
}

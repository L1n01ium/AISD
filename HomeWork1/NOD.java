import java.util.Scanner;

public class NOD {
    public static void main(String[] args) {
        Scanner mysc = new Scanner(System.in);
        int del1 = mysc.nextInt();
        int del2 = mysc.nextInt();
        System.out.println(gcd(del1, del2));
    }
    // ?
    public static int gcd(int a, int b) {
        if (a < b) {
            return gcd(b, a);
        }
        if (b != 0) {
            return gcd(b, a % b);
        }
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
public class task1 {
    public static boolean isShift(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        if (s1.isEmpty()) {
            return false;
        }
        String s3 = s1 + s1;
        return s3.contains(s2);
    }

    public static void main(String[] args) {
        String a = "max";
        String b = "axm";
        String c = "mxa";
        System.out.println(isShift(a,b));
        System.out.println(isShift(a,c));
    }
}
public class part3 {
    // Abdrakhmanova Aruzhan IT-2501
    public static boolean digits(String s, int i) {
        if (i == s.length()) return true;
        if (!Character.isDigit(s.charAt(i))) return false;
        return digits(s, i + 1);
    }
    // Abdrakhmanova Aruzhan IT-2501
    public static int countchars(String s) {
        if (s.equals("")) return 0;
        return 1 + countchars(s.substring(1));
    }
    // Abdrakhmanova Aruzhan IT-2501
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
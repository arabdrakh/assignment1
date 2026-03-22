public class part2 {
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }
    public static void reverse(int[] arr, int n) {
        if (n == 0) return;
        System.out.print(arr[n - 1] + " ");
        reverse(arr, n - 1);
    }
}
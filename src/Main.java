public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        part1.printDigits(5481);

        System.out.println("\nTask 2:");
        int[] arr = {3, 2, 4, 1};
        int sum = part1.sum(arr, arr.length);
        System.out.println((double) sum / arr.length);

        System.out.println("\nTask 3:");
        System.out.println(part1.isPrime(7, 2) ? "Prime" : "Composite");
        System.out.println(part1.isPrime(10, 2) ? "Prime" : "Composite");

        System.out.println("\nTask 4:");
        System.out.println(part1.factorial(5));
        System.out.println(part1.factorial(20));

        System.out.println("\nTask 5:");
        System.out.println(part2.fib(5));
        System.out.println(part2.fib(17));

        System.out.println("\nTask 6:");
        System.out.println(part2.power(2, 10));

        System.out.println("\nTask 7:");
        int[] n = {1, 4, 6, 2};
        part2.reverse(n, n.length);

        System.out.println("\n\nTask 8:");
        System.out.println(part3.digits("123456", 0) ? "Yes" : "No");
        System.out.println(part3.digits("1234k6", 0) ? "Yes" : "No");

        System.out.println("\nTask 9:");
        System.out.println(part3.countchars("hello"));
        System.out.println(part3.countchars("resursion"));

        System.out.println("\nTask 10:");
        System.out.println(part3.gcd(32, 48));
        System.out.println(part3.gcd(10, 7));
    }
}
public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1:");
        part1.printDigits(5481);


        System.out.println("\nTask 2:");
        int[] arr = {3, 2, 4, 1};
        int sum = part1.sum(arr, arr.length);
        System.out.println("Average: " + (double) sum / arr.length);

        System.out.println("\nTask 3:");
        System.out.println(part1.isPrime(7, 2) ? "Prime" : "Composite");

        System.out.println("\nTask 4:");
        System.out.println(part1.factorial(5));
    }
}
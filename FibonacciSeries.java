import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit for Fibonacci series: ");
        int limit = scanner.nextInt();
        int first = 0, second = 1;
        System.out.print("Fibonacci series up to " + limit + ": ");
        System.out.print(first + ", " + second);
        for (int i = 2; i < limit; i++) {
            int next = first + second;
            if (next > limit) {
                break; 
            }
            System.out.print(", " + next);
            first = second;
            second = next;
        }
        scanner.close();
    }
}








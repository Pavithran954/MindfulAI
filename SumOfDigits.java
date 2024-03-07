import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int sum = 0;
        int tempNumber = Math.abs(number);
        for (; tempNumber > 0; tempNumber /= 10) {
            int digit = tempNumber % 10;
            sum += digit;
        }
        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }
}

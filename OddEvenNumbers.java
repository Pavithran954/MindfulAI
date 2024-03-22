import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        int oddCount = 0;
        int evenCount = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        int[] oddNumbers = new int[oddCount];
        int[] evenNumbers = new int[evenCount];

        int oddIndex = 0;
        int evenIndex = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0)
                evenNumbers[evenIndex++] = i;
            else
                oddNumbers[oddIndex++] = i;
        }

        System.out.println("Odd numbers:");
        for (int odd : oddNumbers) {
            System.out.print(odd + " ");
        }

        System.out.println("\nEven numbers:");
        for (int even : evenNumbers) {
            System.out.print(even + " ");
        }
    }
}

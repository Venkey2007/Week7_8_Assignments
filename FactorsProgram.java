import java.util.Scanner;

public class FactorsProgram {

    // Method to find factors and return array
    public static int[] getFactors(int num) {
        int count = 0;

        // First loop to count factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        // Second loop to store factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Method to find sum
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    // Method to find product
    public static int product(int[] arr) {
        int prod = 1;
        for (int i : arr) {
            prod *= i;
        }
        return prod;
    }

    // Method to find sum of squares
    public static double sumOfSquares(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = getFactors(num);

        System.out.println("Factors are:");
        for (int i : factors) {
            System.out.print(i + " ");
        }

        System.out.println("\nSum of factors: " + sum(factors));
        System.out.println("Product of factors: " + product(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquares(factors));

        sc.close();
    }
}
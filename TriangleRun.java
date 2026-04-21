import java.util.Scanner;

public class TriangleRun {

    // Method to calculate number of rounds
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double distance = 5000; // 5 km = 5000 meters
        return distance / perimeter;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input sides
        System.out.print("Enter side 1 (in meters): ");
        double a = sc.nextDouble();

        System.out.print("Enter side 2 (in meters): ");
        double b = sc.nextDouble();

        System.out.print("Enter side 3 (in meters): ");
        double c = sc.nextDouble();

        double rounds = calculateRounds(a, b, c);

        System.out.println("Number of rounds required to complete 5 km: " + rounds);

        sc.close();
    }
}
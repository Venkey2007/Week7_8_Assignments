import java.util.Scanner;

public class LeapYear {

    // Method to check leap year
    public static boolean isLeapYear(int year) {

        if (year < 1582) {
            return false; // not valid for Gregorian calendar
        }

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Invalid year! Enter year >= 1582");
        } else if (isLeapYear(year)) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }

        sc.close();
    }
}
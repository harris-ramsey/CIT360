import java.util.Scanner;

public class W6dot1 {
    /**
    * Calculate the future value
    * @param investmentAmount
    * @param monthlyInterestRate
    * @param years
    * @return The user's future value
    */
    public static double futureValue(double investmentAmount, double monthlyInterestRate, int years) {
        double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years*12);
        return futureValue;
    }

    public static void main(String[] argv) {
        try (Scanner scanner = new Scanner(System.in)) {

        // Informs the user what program does
        System.out.println("Given an investment amount and an annual " +
        "interest rage, this program will calculate the future value " +
        "of the investment for a period of ten years.");

        // Gets information from user
        System.out.print("Enter a positive, non-zero value for the investment: ");
        double startAmount = scanner.nextDouble();

        if (startAmount <= 0) {
            System.err.println("Please enter a number greater than 0");
            System.exit(1);
        }

        System.out.print("Enter an annual interest rate, between 0 and 100: ");
        double interest = scanner.nextDouble();

        if (interest <= 0 || interest > 100) {
            System.err.println("Please enter a number between 0 and 100");
            System.exit(1);
        }

        double intRate = (interest / 12) / 100.0;
        // Calls method to calculate and outputs to user
        System.out.format("%-5s   %-12s%n", "Years", "Future Value");
        for (int i = 1; i <= 10; i++) {
            double future = futureValue(startAmount, intRate, i);
            System.out.format("%-5s   $%-12.2f%n", i, future);
        }

        System.out.println("Goodbye");
        }
    }
}
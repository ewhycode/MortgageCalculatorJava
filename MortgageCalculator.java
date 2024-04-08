import java.util.Scanner; //ask for user input

public class MortgageCalculator {
    public static void main(String[] args) {
        //ask for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mortgage Interest Payment Calculator");

        //input principal amount
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();


        //input annual interest rate
        System.out.print("Enter annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();

        //input loan term in years
        System.out.print("Enter loan term (in years): ");
        int years = scanner.nextInt();

        //calculate monthly interest rate
        double monthlyInterestRate = annualInterestRate / 100 / 12;

        //calculate number of payments
        int numberOfPayments = years * 12;

        //calculate mortgage payment
        double mortgagePayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        //calculate total payment
        double totalPayment = mortgagePayment * numberOfPayments;

        //calculate total interest
        double totalInterest = totalPayment - principal;


        //display results in format specifier 2 decimal places
        System.out.println("\nMortgage Payment: $" + String.format("%.2f", mortgagePayment));
        System.out.println("Total Payment: $" + String.format("%.2f", totalPayment));
        System.out.println("Total Interest: $" + String.format("%.2f", totalInterest));
        
        scanner.close(); // close scanner
    }
}
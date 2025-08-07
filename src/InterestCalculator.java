import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double principal;
        System.out.print("Enter principal amount: ");
        principal = scanner.nextDouble();
        double rate;
        int timesCompounded;
        int years;
        double amount;
        System.out.print("Enter the rate in %");
        rate= scanner.nextDouble()/100;
        System.out.print("Enter the times compounded in years");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years");
        years= scanner.nextInt();

        amount = rate * Math.pow(1+ rate/timesCompounded,timesCompounded*years);

        System.out.print("The amount after "+ years +"years is $"+amount);


    }
}

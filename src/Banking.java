import java.util.Scanner;

public class Banking {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //JAVA BANKING PROGRAM

        double balance = 100;
        boolean isRunning = true;
        int choice;
        while (isRunning) {
            //USER MENU
            System.out.println("***************");
            System.out.println("Banking Program");
            System.out.println("***************");
            System.out.println("1.Show Balance");
            System.out.println("2.Deposit Money");
            System.out.println("3.Withdraw Money");
            System.out.println("4.Exit");
            System.out.println("***************");

            System.out.print("Please enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;

                default -> System.out.println("INVALID CHOICE");

            }
        }

        //EXIT MESSAGE
        System.out.println("***************");
        System.out.println("ThankYou,Have A Nice Day!");
        System.out.println("***************");
        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.println("***************");
        System.out.printf("$%.2f\n", balance);
    }

    static double deposit() {
        double amount;
        System.out.print("Enter amount to be deposited:");
        amount = scanner.nextDouble();
        if (amount < 0) {
            System.out.println("Amount can't be negative");
        } else {
            return amount;
        }
        return 0;
    }

    static double withdraw(double balance) {
        double amount;
        System.out.print("Enter amount to be withdrawn:");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient Balance");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }
    }
}

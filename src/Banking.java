import java.util.Scanner;

public class Banking {
    public static void main(String[] args) {
        //JAVA BANKING PROGRAM
        Scanner scanner = new Scanner(System.in);
        double balance = 0;
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
            System.out.println("Exit");
            System.out.println("***************");

            System.out.print("Please enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Show Balance");
                case 2 -> System.out.println("Deposit");
                case 3 -> System.out.println("Withdraw");
                case 4 -> isRunning = false;

                default -> System.out.println("INVALID CHOICE");

            }
        }
        static void
        //EXIT MESSAGE
        scanner.close();
    }
}

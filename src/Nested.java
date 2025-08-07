import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        char symbols;

        System.out.print("Enter number of rows:");
        rows = scanner.nextInt();

        System.out.print("Enter number of columns:");
        columns = scanner.nextInt();

        System.out.print("Enter symbols:");
        symbols = scanner.next().charAt(0);

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbols);
            }
            System.out.println();
        }


        scanner.close();
    }
}

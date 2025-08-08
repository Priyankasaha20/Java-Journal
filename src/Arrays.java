import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
//        String[] fruits = {"Apple", "Banana", "Orange", "kiwi"};
//        System.out.println(fruits[3]);
        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int size;

        System.out.print("What # of food do you want?:");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        //Taking input
        for (int i = 0; i < foods.length; i++) {
            System.out.println("Enter Food:");
            foods[i] = scanner.nextLine();
        }


        //Showing output
        for (String food : foods) {
            System.out.println(food);
        }
    }
}

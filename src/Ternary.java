import java.util.Scanner;

public class Ternary {
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.println("enter temp:");
        temp = scanner.nextDouble();
        System.out.println("Convert to celsius or fahrenheit:");
        unit= scanner.next().toUpperCase();

        //(condition)? true : false
        newTemp=(unit.equals("C")) ? (temp-32)*5/9 : temp*(5.0/9.0)+32;

        System.out.println("Converted Temperature: " + newTemp + " degrees " + unit);


        scanner.close();
    }
}

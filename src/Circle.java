import java.util.Scanner;

public class Circle {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
     double radius;
     double area;
     double volume;
     double circumference;

     System.out.println("Enter the Radius:");
     radius = scanner.nextDouble();

     circumference = 2*Math.PI*radius;
     System.out.println("Circumference is "+ circumference);

     area = Math.PI*Math.pow(radius,2);
     System.out.println("Area is "+ area);

    scanner.close();
    }
}

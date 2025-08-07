public class Overloading {
    public static void main(String[] args) {

        String pizza = bakePizza("Thin Crust ", "Mozzarella ");
        System.out.println(pizza);
    }

    static String bakePizza(String bread) {
        return bread + "Pizza";
    }

    static String bakePizza(String bread, String cheese) {
        return bread + cheese + "Pizza";
    }
}

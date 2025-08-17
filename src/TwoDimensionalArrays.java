public class TwoDimensionalArrays {
    public static void main(String[] args) {

        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[][] groceries = {fruits, vegetables};

        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
        }
    }


}

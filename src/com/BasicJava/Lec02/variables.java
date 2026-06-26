package src.com.BasicJava.Lec02;
public class variables {
    // Demonstrates declaration and use of common variable types
    private int number = 42;
    private double price = 19.99;
    private String name = "Sample";
    private boolean active = true;

    public void printVars() {
        System.out.println("number = " + number);
        System.out.println("price = " + price);
        System.out.println("name = " + name);
        System.out.println("active = " + active);
    }

    public static void main(String[] args) {
        variables v = new variables();
        v.printVars();

        // Show changing variables
        v.number = 100;
        v.name = "Updated";
        System.out.println("After update:");
        v.printVars();
    }
}

    import java.util.Scanner;

public class task7 {

    static int add(int x, int y)      { return x + y; }
    static int subtract(int x, int y) { return x - y; }
    static int multiply(int x, int y) { return x * y; }
    static double divide(int x, int y){ return (double) x / y; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.println("Sum: "      + add(x, y));
        System.out.println("Difference: " + subtract(x, y));
        System.out.println("Product: "  + multiply(x, y));
        System.out.println("Quotient: " + divide(x, y));
    }
}
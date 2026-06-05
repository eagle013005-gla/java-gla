//Finding the largest number

import java.util.*;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println("All numbers are equal");
        } else if (a >= b && a >= c) {
            System.out.println("The largest number is " + a);
        } else if (b >= a && b >= c) {
            System.out.println("The largest number is " + b);
        } else {
            System.out.println("The largest number is " + c);
        }
        scanner.close();
    }
}
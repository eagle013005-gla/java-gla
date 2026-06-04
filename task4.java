import java.util.*;

public class task4 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();

        if (input.equals(reversed)) {
            System.out.print("The input string is a palindrome.");
        } else {
            System.out.print("The input string is not a palindrome.");
        }
    }
    
}
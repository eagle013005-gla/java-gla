//
public class task8 {
    
    static int sumAll(int... nums) {
        int total = 0;

        for (int n : nums) {
            int cumulative = 0;
            for (int i = 1; i <= n; i++) {
                cumulative += i;
            }
            System.out.println(n + " = " + cumulative);
            total += cumulative;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println("Total Sum: " + sumAll(4, 5, 10));
    } 
}

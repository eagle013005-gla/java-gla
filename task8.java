//
public class task8 {

    static int sumAll(int... nums) {
        int total = 0;

        for (int n : nums) {
            int cumulative = 0;
            System.out.print(n + " = ");

            for (int i = 1; i <= n; i++) {
                cumulative += i;

                if (i < n) {
                    System.out.print(i + " + ");
                } else {
                    System.out.print(i);
                }
            }

            System.out.println(" = " + cumulative);
            total += cumulative;
        }

        return total;
    }

    public static void main(String[] args) {
        int result = sumAll(4, 5, 10);
        System.out.println("Total = " + result);
    }
}

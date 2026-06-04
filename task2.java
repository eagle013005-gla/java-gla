public class task2 {
    public static void main(String[] args) {
        // Primitives (except long and double)
        char h = 'H';
        int three = 3;
        byte one = 1;
        short ten = 10;
        float two = 2.0f;
        boolean t = true;

        // Concatenate into a string
        String output = h + "" + three + one + ten + " w" + (ten - ten) + "rld " + two + " " + t;

        System.out.println(output);

    }
}

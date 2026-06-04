public class task3 {
    public static void main(String[] args) {
        String a = new String("Wow");
        String b = "Wow";
        String c = "Hello"; // different from a → b3 becomes true
        String d = "Wow!";

        boolean b1 = a.equals(b);
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) {
        System.out.println("Success!");        
       }
    }
}

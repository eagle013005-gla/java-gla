interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {

    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            // put gorilla food into cage
            System.out.println("Feeding the gorilla.");
            return true;
        } else {
            System.out.println("Not time to eat yet.");
            return false;
        }
    }

    public void groom() {
        // lather, rinse, repeat
        System.out.println("Grooming the gorilla.");
    }

    public void pet() {
        // pet at your own risk
        System.out.println("Petting the gorilla... carefully!");
    }
}

public class task16 {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();

        System.out.println("Feed (time to eat): " + gorilla.feed(true));
        System.out.println("Feed (not time to eat): " + gorilla.feed(false));
        gorilla.groom();
        gorilla.pet();
    }
}
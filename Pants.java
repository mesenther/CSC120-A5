/* Pants class can display pants */
public class Pants {

    /* Prints ASCII art of pants */
    public void display() {
        System.out.println("      -------------------        ");
        System.out.println("     /////////   \\\\\\\\\\\\\\\\\\");
        System.out.println("    /////////     \\\\\\\\\\\\\\\\\\");
        System.out.println("   /////////       \\\\\\\\\\\\\\\\\\");
        System.out.println("  /////////         \\\\\\\\\\\\\\\\\\");
        System.out.println("  ///////             \\\\\\\\\\\\\\");

    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Pants myPants = new Pants();
        myPants.display();
    }
}

/* Banner class can display a banner with a given message */
public class Banner {
    
    /* Message to print on Banner */
    private String message;

    /* Constructor creates banner with given message */
    public Banner(String m) {
        this.message = m;
    }

    /* Prints ASCII banner with a given message; resizes based on message length */
    public void display() {
        System.out.println(this.message);
        System.out.println("   " + "*".repeat(this.message.length()+1) + "   ");
        System.out.println("*** " + "~".repeat(this.message.length()) + " ***");
        System.out.println("*** " + this.message + " ***");
        System.out.println("*** " + "~".repeat(this.message.length()) + " ***");
        System.out.println("   " + "*".repeat(this.message.length()+1) + "   ");

    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Banner myBanner = new Banner("Happy fall everyone!!!");
        myBanner.display();
    }
}

/* Shirt class can display shirt */
public class Shirt {

    /* Prints ASCII art of shirt */
    public void display() {
        System.out.println("          :-------:           ");
        System.out.println(" ___  ------------------ ___");
        System.out.println(" |||  --------O--------- |||");
        System.out.println(" |||  --------O--------- |||");
        System.out.println(" |||  --------O--------- |||");
        System.out.println(" |||  --------O--------- |||");
        System.out.println(" OOO  --------O--------- OOO");
        System.out.println("  OO  --------O--------- OO");
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Shirt myShirt = new Shirt();
        myShirt.display();
    }
}

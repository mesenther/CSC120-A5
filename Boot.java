/* Boot class can display both left and right boots */
public class Boot {

    /* Direction of boot */
    private String direction;
  
    /* Constructor creates boot object with either left or right direction */
    public Boot(String direction) {
        this.direction = direction.toLowerCase();
    }

    /* Prints ASCII art of either left or right boot if direction is left or right */
    public void display() {
        if (this.direction.equals("left")) {
          System.out.print(" [[[[[[[");
        } else if (this.direction.equals("right")) {
          System.out.print("               ]]]]]]]");
        } else {
          System.out.println("Which boot?");
        }
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Boot myLeftBoot = new Boot("left");
        Boot myRightBoot = new Boot("right");
        myLeftBoot.display();
        myRightBoot.display();
    }
}

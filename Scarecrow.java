/* Scarecrow class, which calls individual classes (Shirt, Pants, etc.) to print the full scarecrow */

class Scarecrow {

    /* Parts of the Scarecrow */
     private Pumpkin head;
     private Shirt body;
     private Pants legs;
     private Boot leftFoot;
     private Boot rightFoot;
     private Banner sign;
     private String message;

    /* Constructor initializes individual given Scarecrow parts */
    public Scarecrow(Pumpkin h, Shirt s, Pants p, Boot b1, Boot b2, Banner m) {
        head = h;
        body = s;
        legs = p;
        leftFoot = b1;
        rightFoot = b2;
        sign = m;
    }

    /* Prints all parts of scarecrow */
    public void display() {
        sign.display();
        head.display();
        body.display();
        legs.display();
        leftFoot.display();
        rightFoot.display();
    }

    /* Main method (for testing) */
    public static void main(String[] args) {

        // Creates scarecrow with scarecrow part constructors
        Scarecrow myScarecrow = new Scarecrow(new Pumpkin(), new Shirt(), new Pants(), new Boot("left"), new Boot("right"), new Banner("Hello!"));

        // If a message was passed in on the command line, extract and store it
        if (args.length > 0) {
            myScarecrow.message = args[0];
            myScarecrow.sign = new Banner(myScarecrow.message);
        }
        myScarecrow.display();
    }

}

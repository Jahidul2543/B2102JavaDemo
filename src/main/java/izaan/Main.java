package izaan;

public class Main {

    public static void main(String[] args) {
	// Single line comment
    /**
    * Multi line comment
    * This is just a comment
    * */
    int a = 2;
    int b = 3;
    int c = a + b;
    // Variable declaration
    int d;
    // Assignment of value into a declared variable
     d = 5;
     int d1 = 5;
     // a>b
     // Reassigned value to d1 container
     d1 = 7;
     // Make the variable a constant one using final key word
        // Try changing the value later -- you should be unable to change
     final int d2 = 6;

     boolean agree = true;
     boolean disagree = false;
     /**
      * You have option to travel in two destination A and B
      * If you choose A flight cost $600
      * If you choose B flight cost $800
      * */
     char destination = ' ';
     //char destination2 = 'B';
     // Variable name starts with small letter
     String myDestination = "Alabama";

     if (destination == 'A'){
        int flightPrice = 600;
         System.out.println("FlightPrice " + flightPrice );
     }
     else if(destination == 'B'){
         int flightPrice = 800;
         System.out.println("FlightPrice " + flightPrice );
     }
     else if(destination == 'C'){
         int flightPrice = 1000;
         System.out.println("FlightPrice " + flightPrice );
     }

     else {
         System.out.println("I do not have enough money to fly");
     }

    }
}

package izaan.class_104;

public class Atm {
    /**
     * ABCD Bank
     * */
    // Every object is considered an instance of a class
    static AbcdBank abcdBank = new AbcdBank();

    public void getAtmId(){
        //AbcdBank abcdBank = new AbcdBank();
        //String atmId = abcdBank.hillsideAtmID;
        String atmIdOfAstoria = AbcdBank.astoraiAtmID;
        System.out.println(atmIdOfAstoria);
    }

    public void checkBalance(){
        // In this method body we can write hundreds lines of code
        int balance = 300000;
        System.out.println("Your balance: "  + balance );
    }

    public void withdrawMoney(){
        int withdrawnAmount = 300;
        System.out.println("Withdrawn " + withdrawnAmount);
    }



}

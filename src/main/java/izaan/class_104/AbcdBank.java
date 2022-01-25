package izaan.class_104;

public class AbcdBank {
    int numberOfAtms = 200;
    // Instance variable
    String hillsideAtmID = "QHIL-A210";
    // Class variable
    // If a field (variable, method) defined as static to access that filed
    // using the Class Name of that object.
    static String astoraiAtmID = "QAST-A211";
    public AbcdBank(){
        System.out.println("I am the default constructor at AbcdBank");
    }

    public void getTotalCashCountOnAtm(){
        int balance = 2000;
        // select balance from ATM  where atm_id = hillsideAtmID;
        System.out.println("ATM ID: " + hillsideAtmID +" Balance: " + balance );
    }

}

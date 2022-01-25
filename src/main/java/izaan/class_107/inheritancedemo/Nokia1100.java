package izaan.class_107.inheritancedemo;

public class Nokia1100 extends PreNokia {
    public Nokia1100(){
        System.out.println("This is a constructor in Nokia1100 Class");
    }
    public void phoneBook(int arg2, String arg1){
        System.out.println("Phonebook Method in Nokia1100");
    }
    // Method overloading - same method with different signature in same class
    public void phoneBook(int arg2, String arg1, String arg3){
        System.out.println("Overloaded phonebook method");
    }


}

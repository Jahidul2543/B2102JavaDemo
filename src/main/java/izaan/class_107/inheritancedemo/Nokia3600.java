package izaan.class_107.inheritancedemo;

public class Nokia3600 extends Nokia1100 {

    public Nokia3600(){
        System.out.println("This is a constructor in Nokia3600 Class");
    }

    public static void main(String[] args) {
        Nokia3600 nokia3600 = new Nokia3600();
        nokia3600.call();
        nokia3600.phoneBook(2, "John", "Don");
    }

    public void camera(){
        System.out.println("Camera method in Nokia3600");
    }

    public void multiMedia(){
        System.out.println("multiMedia method in Nokia3600");
    }
    // Method Overrides
    public void phoneBook(int arg2, String arg1, String arg3){
        System.out.println("Overloaded phonebook method");
        System.out.println("Overloaded phonebook method");
        System.out.println("Overloaded phonebook method");
        System.out.println("Overloaded phonebook method");

    }

}

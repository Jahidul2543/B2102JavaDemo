package izaan.class_107.inheritancedemo;

public abstract class PreNokia implements SymbianPhone {
    // Abstract class - at least
    public void call(){
        System.out.println("Call method in PreNokia class");
    }
    public void text(){
        System.out.println("Send text method in PreNokia Abstract Class");
    }
    abstract public void phoneBook(int arg2, String arg1);
}

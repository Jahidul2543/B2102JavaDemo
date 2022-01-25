package izaan.class103;

public class Phone {

    // Phone jahidulsPhone = new Phone();
    
    public Phone(){
        // No return type in constructor
        System.out.println("Inside Default constructor");
    }

    public static void main(String[] args) {
        Phone jahidulsPhone = new Phone();
       boolean connectionStatus = jahidulsPhone.call(3474134475l); // true / false
        // This line prints in the terminal/console
        System.out.println("Connection Status: " + connectionStatus);
        jahidulsPhone.text(3474134475l);
    }

    public boolean call(long phoneNumber){
        System.out.println("Calling....." + phoneNumber);
        boolean isConnected = false;
        boolean receivesByReceiver = false;
        
        if(receivesByReceiver){
            isConnected = true;
            System.out.println("Connected");
            return isConnected;
        }
        else if (!receivesByReceiver){
            isConnected = false;
            System.out.println("Unable to connect");
            return isConnected;
        }
            
        return isConnected;
    }

    public void text(long phoneNumber){
        System.out.println("Texting....." + phoneNumber);
    }

    public void listenMusic(){
        System.out.println("Listen Music.....");
    }

}

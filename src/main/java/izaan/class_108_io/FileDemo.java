package izaan.class_108_io;

import java.io.FileReader;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        readFile();
        setAndGetCustomProperty();
    }

    public static void readFile() {
        try {
            FileReader fileReader = new FileReader( System.getProperty("user.dir")+"/src/io/izaan/class_108_io/StudentInfo.txt");
            int letter;
            while ((letter = fileReader.read()) != -1 ) {  // 73
                System.out.print((char) letter);
            }
        }
        catch (IOException ioException){
            ioException.printStackTrace();
        }

    }

    public static void setAndGetCustomProperty(){
        // insert property in System
        System.setProperty("Name", " John");
        // Take out property from the system
        System.out.println(System.getProperty("Name"));
    }
}

package izaan.class103;

public class StringDemo {
    public static void main(String[] args) {
        String name = "Johnjjjjjjjjjjjj";
        System.out.println(name);
        String myName = new String("John");
        System.out.println(myName);
        int lenghtOfName = name.length();
        System.out.println("Lenght of Name: " + lenghtOfName);
        char grade = 'A';
        System.out.println(grade + " data type: "   );
        String stringGrade = String.valueOf(grade);
        System.out.println("Value: "+ stringGrade + " data type: " + stringGrade.getClass().getSimpleName());
    }
}

/**
 * 1. Data Types
 * 2. Containers - Variables
 * 3. Object and how it look likes
 * 4. Method - How we use method on an Object?
 * 5. Method can't do anything if you do not have an Object
 * 6. If else statement work
 * 7. Operators
 * 8. Class
 * 9. Constructor and how an object being formed
 * 10. Each container shall have it kind of data
 *
 * */
package izaan.class_105;

public class WhileDemo {
    public static void main(String[] args) {

        int num = 18;
        String name = "Abu";
        char firstInitial = 'A';
        boolean isMale = true;

        if (name.equals("Abu")) {
            System.out.println("Hello Abu");
        } else {
            System.out.println("Wrong person");
        }

        if (num >= 18){
            System.out.println("You are considered an adult");
        }

        while (num >= 18) {
            System.out.println("You are considered an adult");
            num = 0;
        }
        System.out.println("Value of num after the while loop ends: " + num);

        int age = 4;
//        System.out.println("Age: " + age + ", One shall go to school!!!!");
//        age = 5;
//        System.out.println("Age: " + age + ", One shall go to school!!!!");
//        age = 6;
//        System.out.println("Age: " + age + ", One shall go to school!!!!");
//        age = 7;
//        System.out.println("Age: " + age + ", One shall go to school!!!!");
        while (age <= 18){
            System.out.println("Age: " + age + ", One shall go to school!!!!");
//            age = age + 1;
            age++; // Post Incremental Operator. Increment value of age by 1 after every operation
        }

        // One shall go to school up to age 18!!!!
        // for (start; end; HowToIncrement)
        for(age = 4;age <=18; age++ ){
            // Write your code
            System.out.println("Age: " + age + ", One shall go to school!!!!");
        }

        // From point A to B Walk 200 feet, each step is 2 feet long
        int steps = 0;
        for(int distance = 0; distance <= 200;distance++){

            System.out.println("Distance: " + distance + "\nStep Count: " + steps );

            distance = distance + 1;
            steps++;

        }

    }
}

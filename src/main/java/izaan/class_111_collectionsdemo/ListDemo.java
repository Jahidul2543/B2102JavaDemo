package izaan.class_111_collectionsdemo;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        getStudentList();
    }

    public static void getStudentList(){
        List<String> studentList = new ArrayList<>();
        studentList.add("Jhon"); // 0
        studentList.add("Jack"); // 1
        studentList.add("Jack Jr"); // 2
        studentList.add("Jack");
        System.out.println("Number of students: " + studentList.size());
        //System.out.println(studentList.get(1));

        for (int i = 0; i < studentList.size(); i++){
            System.out.println(studentList.get(i));
        }

        for ( String str: studentList) {
            System.out.println("Student Name: " + str);
        }

        studentList.remove(0);
        System.out.println("Number of students: " + studentList.size());
    }
}

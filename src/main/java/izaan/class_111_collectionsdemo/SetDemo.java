package izaan.class_111_collectionsdemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> studentsId = new HashSet<>();
        studentsId.add(121);
        studentsId.add(123);
        studentsId.add(124);
        studentsId.add(125);
        studentsId.add(125);
        System.out.println(studentsId);
    }

}

package izaan.class_111_collectionsdemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // John A
        // Jack B
        Map<String, Character> result = new HashMap<>();
        result.put("John", 'A');
        result.put("Jack", 'B');
        result.put("Rack", 'C');

        for (Map.Entry<String, Character> m: result.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}

package week_9_javaprogramme;

import java.util.HashMap;
import java.util.Map;

/*Create a HashMap object called people that will store String keys and Integer
        values: And use for each loop to iterate the value from Map*/
public class Programme_9_HashmapObject {
    public void iterateValue() {
        Map<String, Integer> store = new HashMap<>();
        store.put("Mumbai", 1);
        store.put("Delhi", 2);
        store.put("Amritsir", 3);
        store.put("Goa", 4);
        store.put("Manali", 5);

        //for each loop//
        for (Map.Entry<String, Integer> keyValue : store.entrySet()) {
            System.out.println(keyValue);
        }

    }
    //declare main method//
    public static void main(String[] args) {
        Programme_9_HashmapObject obj = new Programme_9_HashmapObject();
        obj.iterateValue();
    }
}

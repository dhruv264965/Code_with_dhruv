package Collection.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Employ,String>map=new HashMap<>();
        Employ e1=new Employ(1,"dhruv");
        Employ e2=new Employ(2,"raj");
        Employ e3=new Employ(1,"dhruv");  /// Same as e1 based on id and name
        System.out.println(map);
        map.put(e1,"manger");
        map.put(e2,"developer");
        // Retrieve values
        //with overirde equals and hashcode-->
        System.out.println("e1 Role: " + map.get(e1)); // Manager
        System.out.println("e3 Role: " + map.get(e3)); // Manager
        System.out.println("------------------------------------------------------------------");
        // without overirde equals and hashcode-->If two Employee objects have the same values but hashCode() and equals() are not
        //                                       overridden, they will be treated as different keys because Object's
        //                                       default implementation uses memory addresses for equality and hash code.
        System.out.println("e1 Role: " + map.get(e1)); // Manager
        System.out.println("e3 Role: " + map.get(e3)); // null
        System.out.println("------------------------------------------------------------------");
         // if we modify e1 value-and also override equals and hashcode method
        e1.setName("Alice Changed");
        System.out.println(map.get(e1)); // null
        System.out.println(map.get(e3));


    }
}

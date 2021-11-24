package root;

import java.util.HashMap;
import java.util.Map;

public class Class {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
       map.put("Hello","World");
       map.put("Bye","Hell");
        System.out.println(map.get("Bye"));
    }
}

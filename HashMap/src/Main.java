import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 🔹 1. CREATE HashMap
        // return type: HashMap<K, V>
        HashMap<String, Integer> map = new HashMap<>();


        // 🔹 2. INSERT (put)
        // return type: V (previous value if key exists, else null)
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("mango", 30);

        // inserting duplicate key
        map.put("apple", 50); // replaces old value


        // 🔹 3. SIZE
        // return type: int
        System.out.println("Size: " + map.size());


        // 🔹 4. SEARCH / ACCESS (get)
        // return type: V (value) OR null if not found
        System.out.println("Value of apple: " + map.get("apple"));


        // 🔹 5. CHECK KEY EXISTS (containsKey)
        // return type: boolean
        System.out.println("Contains banana? " + map.containsKey("banana"));


        // 🔹 6. CHECK VALUE EXISTS (containsValue)
        // return type: boolean
        System.out.println("Contains value 30? " + map.containsValue(30));


        // 🔹 7. REMOVE ELEMENT
        // return type: V (removed value) OR null
        map.remove("mango");


        // 🔹 8. PRINT WHOLE MAP
        // return type: String (via toString())
        System.out.println("Map: " + map);


        // ================================
        // 🔥 ITERATION METHODS
        // ================================

        // 🔹 METHOD 1: Using entrySet (BEST METHOD)
        // return type: Set<Map.Entry<K,V>>
        System.out.println("\nUsing entrySet:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            // entry.getKey() → return type: K
            // entry.getValue() → return type: V
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


        // 🔹 METHOD 2: Using keySet
        // return type: Set<K>
        System.out.println("\nUsing keySet:");
        for (String key : map.keySet()) {
            // map.get(key) → return type: V
            System.out.println(key + " -> " + map.get(key));
        }


        // 🔹 METHOD 3: Using values only
        // return type: Collection<V>
        System.out.println("\nValues only:");
        for (Integer value : map.values()) {
            System.out.println(value);
        }


        // 🔹 9. CLEAR MAP
        // return type: void
        map.clear();

        // 🔹 10. CHECK EMPTY
        // return type: boolean
        System.out.println("Is empty? " + map.isEmpty());
    }
}

//map.getOrDefault(key, 0)
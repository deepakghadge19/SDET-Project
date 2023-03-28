package collections_16March2023;

import java.util.HashMap;

public class HashMapFeature {
    public void hashSetOperations() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);
        System.out.println("Elements from HashMap are :" + map);
        System.out.println("Size of HashMap is :" + map.size());

        if (map.containsKey("a")) {
            Integer a = map.get("a");
            System.out.println("value of a is :" + a);
        }
        System.out.println("\nPrint all elements from HashMap :");
        for (String key : map.keySet()) {
            System.out.println("key " + key + " value:" + map.get(key));
        }
    }

    public static void main(String[] args) {
        HashMapFeature hashMapFeature = new HashMapFeature();
        hashMapFeature.hashSetOperations();
    }
}

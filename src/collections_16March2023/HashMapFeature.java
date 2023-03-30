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
            Integer hashMapVariable = map.get("a");
            System.out.println("value of a is :" + hashMapVariable);
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
/*OUTPUT
"C:\Program Files\Java\jdk-17.0.4.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=56920:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -classpath "F:\TI Automation workspace\eclipse-workspace\SDET_Project\out\production\SDET_Project" collections_16March2023.HashMapFeature
Elements from HashMap are :{a=10, b=20, c=30}
Size of HashMap is :3
value of a is :10

Print all elements from HashMap :
key a value:10
key b value:20
key c value:30

Process finished with exit code 0
 */
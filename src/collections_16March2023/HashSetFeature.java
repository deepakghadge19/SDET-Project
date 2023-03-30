package collections_16March2023;

import java.util.HashSet;
import java.util.Set;

public class HashSetFeature {
    public void hashSetOperations() {
        Set hashset = new HashSet();
        hashset.add("deepak");
        hashset.add("suyog");
        hashset.add("nitin");
        hashset.add("prasad");
        System.out.println("All added elements from hash set :" + hashset);

        boolean isRemoved = hashset.remove("prasad");
        //To check the element is removed or not
        if (isRemoved == true) {
            System.out.println("\nElement 'prasad' is removed from HashSet");
            System.out.println("Hash set after remove the element :" + hashset);
        } else {
            System.out.println("\nElement is not removed from HashSet");
        }
        System.out.println("\nPrint all elements from HashSet :");
        for (Object hashSetElement : hashset) {
            System.out.println(hashSetElement);
        }
    }

    public static void main(String[] args) {
        HashSetFeature hashSetFeature = new HashSetFeature();
        hashSetFeature.hashSetOperations();
    }
}
/*OUTPUT
"C:\Program Files\Java\jdk-17.0.4.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=59434:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -classpath "F:\TI Automation workspace\eclipse-workspace\SDET_Project\out\production\SDET_Project" collections_16March2023.HashSetFeature
All added elements from hash set :[nitin, suyog, prasad, deepak]

Element 'prasad' is removed from HashSet
Hash set after remove the element :[nitin, suyog, deepak]

Print all elements from HashSet :
nitin
suyog
deepak

Process finished with exit code 0
 */
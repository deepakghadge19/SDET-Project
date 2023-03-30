package collections_16March2023;

import java.util.TreeSet;

public class TreeSetFeature {
    public void treeSetOperations() {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Z");
        treeSet.add("A");
        treeSet.add("X");
        treeSet.add("Y");
        System.out.println("Elements from treeSet :" + treeSet);// print element in ordered form

        System.out.println("Check if C present :" + treeSet.contains("C"));

        boolean isRemoved = treeSet.remove("A");
        //To check the element is removed or not
        if (isRemoved == true) {
            System.out.println("Element 'A' is removed and updated treeSet is :" + treeSet);
        } else {
            System.out.println("Element 'A' is not removed ");
        }
    }

    public static void main(String[] args) {
        TreeSetFeature treeSetFeature = new TreeSetFeature();
        treeSetFeature.treeSetOperations();
    }
}
/*OUTPUT
"C:\Program Files\Java\jdk-17.0.4.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=58443:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -classpath "F:\TI Automation workspace\eclipse-workspace\SDET_Project\out\production\SDET_Project" collections_16March2023.TreeSetFeature
Elements from treeSet :[A, X, Y, Z]
Check if C present :false
Element 'A' is removed and updated treeSet is :[X, Y, Z]

Process finished with exit code 0
 */
package collections_16March2023;

import java.util.TreeMap;

public class TreeMapFeature {
    public void treeMapOperations() {
        TreeMap<String, Integer> treemap = new TreeMap<>();
        treemap.put("B", 5);
        treemap.put("A", 1);
        treemap.put("C", 3);
        System.out.println("Elements from treemap :" + treemap);//print element
        System.out.println("Tree Size :" + treemap.size());
    }

    public static void main(String[] args) {
        TreeMapFeature treeMapFeature = new TreeMapFeature();
        treeMapFeature.treeMapOperations();
    }
}
/*OUTPUT
"C:\Program Files\Java\jdk-17.0.4.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=54354:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -classpath "F:\TI Automation workspace\eclipse-workspace\SDET_Project\out\production\SDET_Project" collections_16March2023.TreeMapFeature
Elements from treemap :{A=1, B=5, C=3}
Tree Size :3

Process finished with exit code 0
 */
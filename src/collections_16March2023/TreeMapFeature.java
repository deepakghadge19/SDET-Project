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

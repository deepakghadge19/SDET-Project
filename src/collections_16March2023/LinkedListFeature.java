package collections_16March2023;

import java.util.LinkedList;

public class LinkedListFeature {
    public void hashSetOperations() {
        LinkedList<String> list = new LinkedList<>();
        list.add("sun");
        list.add("mon");
        list.add("tues");
        list.add("wed");
        System.out.println("Elements from LinkedList :" + list);
        list.add(1, "thurs");
        System.out.println("LinkedList after adding element at 1st index :" + list);

        boolean isRemoved = list.remove("mon");
        //To check the element is removed or not
        if (isRemoved == true) {
            System.out.println("Element 'mon' is removed and updated LinkedList is :" + list);
        } else {
            System.out.println("Element is not removed");
        }

        list.addFirst("sat");
        list.addLast("sun");
        System.out.println("Elements from LinkedList after adding 'sat' and 'sun':" + list);
    }

    public static void main(String[] args) {
        LinkedListFeature linkedListFeature = new LinkedListFeature();
        linkedListFeature.hashSetOperations();
    }
}
/*OUTPUT
"C:\Program Files\Java\jdk-17.0.4.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=51312:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -classpath "F:\TI Automation workspace\eclipse-workspace\SDET_Project\out\production\SDET_Project" collections_16March2023.LinkedListFeature
Elements from LinkedList :[sun, mon, tues, wed]
LinkedList after adding element at 1st index :[sun, thurs, mon, tues, wed]
Element 'mon' is removed and updated LinkedList is :[sun, thurs, tues, wed]
Elements from LinkedList after adding 'sat' and 'sun':[sat, sun, thurs, tues, wed, sun]

Process finished with exit code 0
 */

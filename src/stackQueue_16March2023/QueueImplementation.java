package stackQueue_16March2023;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImplementation {
    public void queueFeatures() {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("India");
        queue.add("Germany");
        queue.add("America");
        System.out.println("Original queue :" + queue);
        System.out.println("Head of queue :" + queue.peek());
        queue.remove();
        System.out.println("Queue after removing the element :" + queue);
        System.out.println("Removed Head :" + queue.poll());
        System.out.println("Queue now look like :" + queue);
    }

    public static void main(String[] args) {
        QueueImplementation queueImplementation = new QueueImplementation();
        queueImplementation.queueFeatures();
    }
}
/*OUTPUT
"C:\Program Files\Java\jdk-17.0.4.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=57643:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -classpath "F:\TI Automation workspace\eclipse-workspace\SDET_Project\out\production\SDET_Project" stackQueue_16March2023.QueueImplementation
Original queue :[America, India, Germany]
Head of queue :America
Queue after removing the element :[Germany, India]
Removed Head :Germany
Queue now look like :[India]

Process finished with exit code 0
 */
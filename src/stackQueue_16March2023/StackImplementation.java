package stackQueue_16March2023;

import java.util.Stack;

public class StackImplementation {
    public void stackFeatures() {
        Stack<String> stack = new Stack<>();
        stack.push("suresh");
        stack.push("rajesh");
        stack.push("mangesh");
        stack.push("dipesh");

        System.out.println("Original stack :" + stack);
        System.out.println("Top Element :" + stack.peek());
        System.out.println("Popped Element :" + stack.pop());
        System.out.println("Now stack looks like :" + stack);
    }

    public static void main(String[] args) {
        StackImplementation stackImplementation = new StackImplementation();
        stackImplementation.stackFeatures();
    }
}
/*OUTPUT
"C:\Program Files\Java\jdk-17.0.4.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=52637:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -classpath "F:\TI Automation workspace\eclipse-workspace\SDET_Project\out\production\SDET_Project" stackQueue_16March2023.StackImplementation
Original stack :[suresh, rajesh, mangesh, dipesh]
Top Element :dipesh
Popped Element :dipesh
Now stack looks like :[suresh, rajesh, mangesh]

Process finished with exit code 0
 */
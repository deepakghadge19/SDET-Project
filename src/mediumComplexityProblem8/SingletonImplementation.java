package mediumComplexityProblem8;

public class SingletonImplementation {
    private static SingletonImplementation singletonObj;

    private SingletonImplementation() {
        System.out.println("Constructor will invoke for only one object");
    }

    public static SingletonImplementation getInstance() {
        if (singletonObj == null) {
            singletonObj = new SingletonImplementation();
        }
        return singletonObj;
    }
}

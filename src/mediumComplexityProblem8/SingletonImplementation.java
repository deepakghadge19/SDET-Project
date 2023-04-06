package mediumComplexityProblem8;

public class SingletonImplementation {
    private static SingletonImplementation singletonObj = new SingletonImplementation();

    private SingletonImplementation() {
        System.out.println("Constructor will invoke for only one object");
    }

    public static SingletonImplementation getInstance() {
        return singletonObj;
    }

    public static void main(String[] args) {
        SingletonImplementation firstObj = SingletonImplementation.getInstance();
        SingletonImplementation secondObj = SingletonImplementation.getInstance();
        if (firstObj == secondObj) {
            System.out.println("'firstObj and secondObj' are pointing to the same object");
        } else {
            System.out.println("Objects 'firstObj and secondObj' are not pointing to the same object i.e singletonObj");
        }
    }
}

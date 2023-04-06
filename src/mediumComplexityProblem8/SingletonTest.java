package mediumComplexityProblem8;

public class SingletonTest {
    public static void main(String[] args) {
        SingletonImplementation firstObj = SingletonImplementation.getInstance();
        System.out.println("Hashcode of first object is :" + firstObj.hashCode());
        SingletonImplementation secondObj = SingletonImplementation.getInstance();
        System.out.println("Hashcode of Second object is :" + secondObj.hashCode());
        if (firstObj == secondObj) {
            System.out.println("'firstObj and secondObj' are equal so they are pointing to the same object");
        } else {
            System.out.println("'firstObj and secondObj' are not equal so they are pointing to the different object");
        }
    }
}

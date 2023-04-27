package codingPracticeProblem1;

public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static void main(String[] args) {
        Dog firstDog = new Dog("Buddy", "Golden Retriever");
        Dog secondDog = new Dog("Charlie", "Bulldog");

        System.out.println(firstDog.getName() + " is a " + firstDog.getBreed() + ".");
        System.out.println(secondDog.getName() + " is a " + secondDog.getBreed() + ".");

        System.out.println("\nSet the new Breed of FirstDog and new name of SecondDog:");
        firstDog.setBreed("Labrador Retriever");
        secondDog.setName("Daisy");

        System.out.println(firstDog.getName() + " is now a " + firstDog.getBreed() + ".");
        System.out.println(secondDog.getName() + " is now a " + secondDog.getBreed() + ".");
    }
}

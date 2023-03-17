package class_Constructor_AccessModifiers_17March2023;

public class StudentClassDemo {

	String name;
	int age;
	String address;

	public StudentClassDemo(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public static void main(String[] args) {
		StudentClassDemo john = new StudentClassDemo("Deepak", 28, "Kothrud");
		System.out.println("Name:"+john.name+"; "+"Age:"+ john.age+"; "+"Address:"+john.address);
	}

}

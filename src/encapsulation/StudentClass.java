package encapsulation;

public class StudentClass {
	private String name;
	private int age;
	private String address;

	public StudentClass(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public static void main(String[] args) {
		StudentClass stud = new StudentClass("Deepak", 25, "Pune");
		System.out.println("Name:" + stud.name + "; " + "Age:" + stud.age + "; " + "Address:" + stud.address);
		System.out.println("------------------------------------------------------");
		System.out.println("Initial Name :"+stud.getName());
		System.out.println("Initial Age :"+stud.getAge());
		stud.setAddress("Mumbai");
		System.out.println("New Address :"+stud.getAddress());
	}
}

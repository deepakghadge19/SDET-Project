package class_Constructor_AccessModifiers_17March2023;

public class CuboidConstructorDemo {
	int width;
	int height;
	int depth;

	CuboidConstructorDemo(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	CuboidConstructorDemo(int width, int height) {
		this.width = width;
		this.height = height;
		this.depth = 10;
	}

	CuboidConstructorDemo(int dimension) {
		width = dimension;
		height = dimension;
		depth = dimension;
	}

	CuboidConstructorDemo() {
		this.width = 5;
		this.height = 5;
		this.depth = 5;
	}

	int volume() {
		return width * height * depth;
	}

	public static void main(String[] args) {
		CuboidConstructorDemo stdCuboid = new CuboidConstructorDemo(10, 20, 30);
		System.out.println("Volume of standard cuboid is: " + stdCuboid.volume());
		
		CuboidConstructorDemo cuboidWithDefault = new CuboidConstructorDemo(10, 20);
		System.out.println("Volume of default depth cuboid is: " + cuboidWithDefault.volume());
		
		CuboidConstructorDemo cube = new CuboidConstructorDemo(10);
		System.out.println("Volume of cube is: " + cube.volume());
		
		CuboidConstructorDemo defaultCuboid = new CuboidConstructorDemo();
		System.out.println("Volume of default cuboid is: " + defaultCuboid.volume());
	}

}

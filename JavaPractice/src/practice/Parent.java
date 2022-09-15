package practice;

public class Parent {
	Parent() {
		System.out.println("I am parent class Constructor");
	}

	{
		System.out.println("I am parent class non static block");
	}
	static {
		System.out.println("I am parent class static block");
	}

	public static void main(String[] args) {
		int[][] a = new int[3][1];
		int[] b = new int[2];
		int[] a1 = { 2, 6, 8, 57, 5, 68 };
		int[][] a5 = { { 2, 1, 2 }, { 5, 9, 30 }, { 5, 9, 6 } };
		b[0] = 1;
		b[1] = 1;
		System.out.println(b);

	}
}

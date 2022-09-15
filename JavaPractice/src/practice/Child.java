package practice;

public class Child extends Parent {
	Child(int a) {
		super();
		System.out.println("I am child class Constructor1");
	}

	Child() {
		this(5);
		System.out.println("I am child class Constructor");
	}

	{
		System.out.println("I am child class non static block");
	}
	static {
		System.out.println("I am child class static block");
	}

	public static void main(String[] args) {
		Child ref = new Child();
	}

}

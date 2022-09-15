package practice;

public class Class2 extends Class1 {
	int a = 100;

	Class2() {
		super();
		System.out.println("Child class Constructor");

	}

	@Override
	public String javaMethod(int a) {
		// TODO Auto-generated method stub
		String as = "int is" + a;
		return as;
	}

	@Override
	public String javaMethod1() {
		// TODO Auto-generated method stub
		return "Java";
	}

	public String smethod(String hj) {
		return "sub Class String";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1 if2 = new Class2();
		Class2 if1 = new Class2();
		System.out.println(if2.string);
		System.out.println(if2.i);
		System.out.println(if2.javaMethod(100));
		System.out.println(if2.javaMethod1());
		System.out.println(if2.smethod("kkk"));
		System.out.println(if1.smethod("1"));
		System.out.println(if2.a);
		System.out.println(if1.a);
		System.out.println(if2.smethod("hg"));
		System.out.println(if1.smethod("1"));
	}

}

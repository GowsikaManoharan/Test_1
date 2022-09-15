package practice;

public class Practice {
	int ij =100;
	static int ik = 102;
	public static void method()
	{
		System.out.println(ik);
	}
	static {System.out.println("I am a Static block");	}
	Practice() {System.out.println("I am a Constructor");}
	{System.out.println("I am a non static block");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice p1 = new Practice();
		Practice p2 = new Practice();
		System.out.println(ik);
		Practice.ik=200;
		System.out.println(p1.ij);
		System.out.println(ik);
	}

}

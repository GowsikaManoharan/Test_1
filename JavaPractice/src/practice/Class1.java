package practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class Class1 extends Practice implements Interface1, Interface2 {
	int a = 10;

	Class1() {
		System.out.println("Parent class constructor");
	}
	public void javam() {}
	public String smethod(String string) {
		return "Main Class String";
	}

	public String smethod1() {
		return "Main Class String dummy";
	}

	@Override
	public abstract String javaMethod(int a);

	@Override
	public abstract String javaMethod1();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ah = { 's', 'a', 't', 'i', 's', 'h' };
		String st1 = "Gowsika";
		String str = new String(ah);
		System.out.println(str.charAt(3));
		System.out.println(str.indexOf('h'));
		System.out.println(str.length());
		System.out.println("The String is" + st1);
		System.out.println(str.substring(2));
		System.out.println(str);
		System.out.println(str.equals(st1));
		System.out.println(str.concat(st1));
		String[] d = str.split("t");
		System.out.println(d[0]);
		StringBuilder sb = new StringBuilder(5);
		sb.append("Gowsika");
		System.out.println(sb);

		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DATE));
		SimpleDateFormat sf = new SimpleDateFormat("E/M/Y");
		System.out.println(sf.format(cal.getTime()));
		Date dt = new Date();
		System.out.println(dt.toString());
		System.out.println(sf.format(dt));

		try {
			int i = 100;
			int j = 1 / 0;
		}
		 catch (ArithmeticException e1) {
				System.out.println("Arith");
			} catch (Exception e) {
				System.out.println(e);
			}
		finally {
			System.out.println("Execution is done");
		}
	}

}

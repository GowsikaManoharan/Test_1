package practice;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int a = 1; a <=50; a++) {
			if(a%5==0)
			{
				System.out.println("Buzz");
			}
			if(a%3==0)
			{
				System.out.println("Fizz");
			}
			else
			{
				System.out.println(a);
			}
		}
	}

}

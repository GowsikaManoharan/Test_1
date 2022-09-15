package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Java_Interview_Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Fibonacci series
		int a = 0;
		int b = 1;
		int c = 0;
		for (int i = 0; c < 100; i++) {
			System.out.print(" " + c);
			c = b + a;
			b = a;
			a = c;
		}
		System.out.println();
		// Prime Number
		int a1 = 95;
		int b1 = 0;
		for (int i = 2; i < 95; i++) {
			if (a1 % i == 0) {
				b1++;
				break;
			}
		}
		if (b1 > 0) {
			System.out.println("Not a prime number");
		} else {
			System.out.println("Prime Number");
		}
		// Reverse String and String Palindrome
		String string = "Mom";
		String dummy = "";
		int length = string.length();
		for (int a2 = length - 1; a2 >= 0; a2--) {
			dummy = dummy + string.charAt(a2);
		}
		System.out.println(dummy);
		if (string.equalsIgnoreCase(dummy)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
		// Integer Palindrome
		int temp = 1001;
		int number = temp;
		int r, sum = 0;
		while (temp > 0) {
			r = temp % 10;
			sum = (sum * 10) + r;
			temp = temp / 10;
		}
		System.out.println(sum);
		if (number == sum) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

		// swap using 3rd variable
		int temp1 = 100;
		int temp2 = 1000;
		int temp3;
		temp3 = temp1;
		temp1 = temp2;
		temp2 = temp3;
		System.out.println(temp1);
		System.out.println(temp2);
		temp1 = temp1 + temp2;
		temp2 = temp1 - temp2;
		temp1 = temp1 - temp2;
		System.out.println(temp1);
		System.out.println(temp2);

		// Count of words in a string in Hashmap and interating Hashmap
		String sentense = "This this is is work work done";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String[] sp = sentense.split(" ");
		for (int i = 0; i < sp.length; i++) {
			if (map.containsKey(sp[i])) {
				int count = map.get(sp[i]);
				map.put(sp[i], count + 1);
			} else {
				map.put(sp[i], 1);
			}
		}
		System.out.println(map);
		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		// Iterating ArrayList
		ArrayList<String> sm = new ArrayList<String>();
		sm.add("a1");
		sm.add("a2");
		sm.add("a3");
		sm.add("a1");
		sm.add("a5");
		sm.add("a6");
		sm.add("a7");
		sm.add("a8");
		sm.add("a9");
		for (int m = 0; m < sm.size(); m++) {
			System.out.println(sm.get(m));
		}
		Iterator it1 =sm.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		for(String s :sm)
		{
			System.out.println(s);
		}
		//Duplicate charecters in string
		String sat = "Sathishia";
		char[] cha = sat.toCharArray();
		for(int sa=0;sa<cha.length;sa++)
		{
			for(int saq=sa+1;saq<cha.length;saq++)
			{
			if(cha[sa]==cha[saq])
			{
				System.out.println(cha[sa]);
			}
			}
		}
		//Sorting number Array
		int[] ap = {10,20,50,60,30,90,80};
		int tempw;
		for(int sa=0;sa<ap.length;sa++)
		{
			for(int saq=sa+1;saq<ap.length;saq++)
			{
			if(ap[sa]>ap[saq])
			{
                tempw=ap[sa];
                ap[sa]=ap[saq];
                ap[saq]=tempw;
			}
			}
		}
		for(int i=0;i<ap.length;i++)
		{
			System.out.println(ap[i]);
		}
		//Finding Vowel in String
		String ab ="nnnn";
		String str =ab.toLowerCase();
	 char[] charo = str.toCharArray();
	 for(int i=0;i<charo.length;i++)
	 {
		 if(charo[i]=='a'||charo[i]=='e'||charo[i]=='i'||charo[i]=='o'||charo[i]=='u')
		 {
			 System.out.println("Yes");
			 break;
		 }
	 }
		
		
		
	}
}

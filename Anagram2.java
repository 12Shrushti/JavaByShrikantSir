import java.util.*;
class Anagram2{
	public static void main(String[] args) {
		String str1= "silent";
		String str2 ="listen";

		char[] ch1 =str1.toCharArray();
		char [] ch2 = str2.toCharArray();
		// System.out.println(Arrays.toString(ch1));
		// System.out.println(Arrays.toString(ch2));

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		System.out.println(Arrays.toString(ch1));
		System.out.println(Arrays.toString(ch2));

		boolean b= Arrays.equals(ch1,ch2); //false
		if(b)
			System.out.println("It is Anagram ");
		else 
			System.out.println("It is not Anagram");
	}
}
import java.util.*;
class Anagram{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First String: ");
		String str1 = sc.next();
		System.out.print("Enter the Second String : ");
		String str2 = sc.next();
		// String str1= "silent";
		// String str2= "LiSTEN";
		str1= str1.toLowerCase();
		str2 = str2.toLowerCase();
		System.out.println(str1);
		System.out.println(str2);

		if(str1.length() != str2.length())
		{
			System.out.println("Is Not an Anagram");
			return ;
		}


		char [] ch1= str1.toCharArray();
		char [] ch2= str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);



		if(Arrays.equals(ch1,ch2))
			System.out.println("Is A Anagram");
		else 
			System.out.println("Is not a Anagram");
	


	}
}
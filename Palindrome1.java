import java.util.*;
class Palindrome1{
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);

		if(palindrome(num ,num2)
			System.out.println("Is Palindrome");
		else 
			System.out.println("not Palindrome");
		
	}
	public static boolean palindrome(int num, int num2){
		int temp=num;
		int rev=0;

		while(num!=0){
			int rem =num%10;
			rev=rev*10+rem;
			num/=10;
		}
		
		// return rev == num2;
	}
}
import java.util.*;
class PalindromeString{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str =sc.next();
		// String str= "helo";
		String str2="";
		for(int i=str.length()-1 ;i>=0;i--){
			str2 += str.charAt(i);
		}
		System.out.println(str2.equals(str) ? str+ " is Palindrome": str+ " is not Palindrome");
	}
}
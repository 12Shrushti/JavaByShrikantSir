import java.util.Scanner;
class Case{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char ch = sc.next().charAt(0);
		
		System.out.println(ch>='a'&& ch<='z' ? ch+ "LowerCase" :(ch>='A'&& ch<='Z'? ch + " is UpperCase": "Invalid Character"));
	}
}
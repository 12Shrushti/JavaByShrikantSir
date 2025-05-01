import java.util.Scanner;
class DigitOrNot{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Character: ");
		int n= sc.nextInt();
		System.out.println((n>=0 && n<=9) ? n +" is Digit" :((n>='a' && n<='z') ||(n>='A' &&n<='Z') ?"Alphabet" : "Special Character");
	}
}
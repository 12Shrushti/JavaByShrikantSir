import java.util.*;
class CompareToFun{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Fisrt word: ");
		String str1=sc.next();
		System.out.print("Enter the Second Word: ");
		String str2 =sc.next();

		System.out.println(str1.compareToIgnoreCase(str2)>0? " YES": "NO");
	}
}
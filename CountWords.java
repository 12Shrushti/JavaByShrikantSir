import java.util.Scanner;
class CountWords{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");

		String str = sc.nextLine();
		
		int length =str.split("\\s").length;
		
		System.out.print("there are "+length+" words in the string");
	}
}
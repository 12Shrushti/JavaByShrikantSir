import java.util.Scanner;
class MaxOfTwo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First number : ");
		int n1=sc.nextInt();
		System.out.print("Enter Second number : ");
		int n2 =sc.nextInt();

		if(n1>n2)
			System.out.println(n1 + " is greatest of two");
		else
			System.out.println(n2 + " is greatest of two");
	}
}
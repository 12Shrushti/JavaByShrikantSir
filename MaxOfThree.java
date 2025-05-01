import java.util.Scanner;
class MaxOfThree{
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		System.out.println("Enter first number: ");
		int n1 =sc.nextInt();
		System.out.println("Enter second number: ");
		int n2 =sc.nextInt();
		System.out.println("Enter third number: ");
		int n3 =sc.nextInt();

		int result = n1 > n2 ? n1 : n2;
		 result =result > n3 ? result : n3;

		System.out.println(result+ " is the greatest of three");

	}
}
import java.util.Scanner;
class TcsPrep2{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int fact=1;

		for(int i=1; i<=num; i++){
			fact *=i;
		}
		System.out.println("Factorial of "+num + " is: "+fact);
	}
}
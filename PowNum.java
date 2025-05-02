import java.util.Scanner;
class PowNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int pow =2;
		int result =1;

		while(pow != 0){
			result *=num;
			pow--;
		}
		System.out.println("Power of "+ num+ " is "+ result);
	}
}
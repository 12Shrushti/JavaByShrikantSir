import java.util.Scanner;
class SumInRange{
	public static void main(String[] args) 
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter the number: ");
	 int n =sc.nextInt();
	 System.out.print("Enter the range: ");
	 int n1 =sc.nextInt();
	 int sum=0;

	 for(int i=n ; i<=n1; i++){
	 	sum+=i;
	 }
	 System.out.println("Sum from "+ n +" to "+n1 + " is "+sum);

	}
}
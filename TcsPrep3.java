import java.util.Scanner;
class TcsPrep3
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		if(isPrime(num))
			System.out.println("Number is Prime number");
		else 
			System.out.println("Number is not Prime number");

	}
	public static boolean isPrime(int num) {
		boolean isPrime=true;

		if(num<=1)
			return false;
		for(int i=2; i<=Math.sqrt(num); i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
}
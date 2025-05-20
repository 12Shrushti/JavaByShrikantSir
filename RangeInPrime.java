import java.util.Scanner;
class RangeInPrime{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the lowest range: ");
	int low= sc.nextInt();

	System.out.print("Enter the largest range: ");
	int large = sc.nextInt();

	for(int i=2; i<=large; i++){
		int count=0;

		if(i%2!=0){
			count++;
		}
		if(count!=2)
			System.out.println(i);
		
	}

	
	}
}
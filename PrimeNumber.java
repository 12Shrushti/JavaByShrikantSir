import java.util.Scanner;
class PrimeNumber{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Number : ");
	int n=sc.nextInt();
	int cnt=0;

	for(int i=1; i<=n;i++)
		if(n%i==0)
			cnt++;
	if(cnt>2)
		System.out.println(n + " is Not Prime number");
	else  
		System.out.println(n + " is prime number");
	}
}
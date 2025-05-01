import java.util.Scanner;
class Demo1{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();//1001 ->1551
		int temp=5;
		int rev=0;

		while(n!=0){
			int rem=n%10;
			if(rem==0)
				rev=rev*10+temp;	
			else
				rev =rev*10+rem;
			n/=10;
		}

		int result =0;
		// int rev1=0;
		while(rev!=0){
			int rem= rev%10;
			result =result*10+ rem;
			rev/=10;
		}
		

	System.out.println(result);
	}
}
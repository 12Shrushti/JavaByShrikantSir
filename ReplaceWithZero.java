import java.util.Scanner;
class ReplaceWithZero{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int rem=0;
		long rev=0;

		while(num!=0){
		 rem=num%10;
			if(rem==0)
				rem=1;
		 rev= rev*10+rem;
		 num/=10;
		}
		num=(int) rev;
		
		rev=0;
		while(num!=0){
		 rem=num%10;
		 rev= rev*10+rem;
		 num/=10;
		}
		System.out.println("After replacing zero with one: "+rev);
		
	}
}
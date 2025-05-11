import java.util.Scanner;
class CognizantPractice{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n=4;

		int digit[] = new int[n];
		System.out.println("Enter the "+n+" digits: ");

		for(int i=0; i<n; i++){
			digit[i]=sc.nextInt();
		}
		// int digit[]= {65,66,67,68};
		char ch='A';
		// sc.nextInt();

		for(int i=0; i<=3;i++, ch++){
			
				System.out.println(digit[i]+":"+ch);
			
		}

	}
}
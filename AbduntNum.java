import java.util.Scanner;
class AbduntNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1; i<n; i++)
			if(n%i==0)
				sum+=i;
		//Abdunant number means, the sum of factors excluding the same number of a given number is greater,....if not
		//it is not a abdunt number
	    //for ex ->18 have factors such as 1,2,3,6,9 and sum of them is 1+2+3+6+9=21 which is greater than 18 i.e(21 > 18) 
		System.out.println(sum>n ? n+" is Abdunt Number" :n +" is not Abdunt Number" );
	}
}
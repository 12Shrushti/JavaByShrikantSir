import java.util.Scanner;
class FriendlyPair{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int n1 =sc.nextInt();
		System.out.println("Enter the Second Number");
		int n2 =sc.nextInt();

		int fact1=0 ,fact2=0 ; 
		for(int i =1 ; i<n1 ; i++){
			if(n1%i==0){
				fact1+=i;
			}
		}
		for(int i=1; i<n2; i++){
			if(n2%i==0){
				fact2+=i;
			}
		}
		if(n1/fact1==1 && n2/fact2==1)
			System.out.println(n1 + " and "+ n2 + " is Friendly Pair");
		else 
			System.out.println(n1 + " and "+ n2 + " is not Friendly Pair");
	}
}
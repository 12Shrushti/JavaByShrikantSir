import java.util.Scanner;
class TcsPrep1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++){
			if(num%i==0){
				System.out.print(i+" ");
			}
		}
		
	}
}




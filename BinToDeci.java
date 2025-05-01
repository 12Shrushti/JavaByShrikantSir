import java.util.Scanner;
class BinToDeci{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int bin=sc.nextInt();
		int deci =0 ;
		int n=0;
		while(bin>0){
			int rem = bin%10;
			deci+= rem * Math.pow(2,n);
			bin/=10;
			n++;
		}
		System.out.println(deci);
	}
}
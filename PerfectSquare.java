 import java.util.Scanner;
 class PerfectSquare{
 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter the Square Number: ");

 		int sqr = sc.nextInt();
 		int num = (int)Math.sqrt(sqr);
 		if(isSquare(sqr))
 			System.out.println(sqr +" is Perfect Square of "+num);
 		else 
 			System.out.println(sqr+ " is not Perfect Square");
 	}
 	public static boolean isSquare(int sqr){
 		int num = (int)Math.sqrt(sqr);
 		if((num*num)==sqr)
 			return true;

 		return false;
 	}
 }
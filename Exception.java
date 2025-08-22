import java.util.Scanner;
class Exception{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first Number: ");
		int a=sc.nextInt();
		System.out.print("Enter the Second Number: ");
		int b=sc.nextInt();
		System.out.print("Answer: ");
		try{
			
			System.out.println(a/b); /////exception
			
		}
		catch(ArithmeticException e){
			System.out.println("DO not divide number with zero");
		}
		 
	}
}
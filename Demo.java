// import java.util.Scanner;
// class Demo{
// public static void main(String[] args) {
	
// 		Scanner sc= new Scanner(System.in);
// 		System.out.print("Enter a Character: ");
// 		int n=sc.nextInt();
// 		if(n%2==0 && n%5!=0){
// 			System.out.println("HiTwo");
// 		}
// 		if(n%5==0 && n%2!=0){
// 			System.out.println("HiFive");
// 		}
// 		if(n%2==0 && n%5==0){
// 			System.out.println("HiTwoHiFive");
// 		}
// 	}
// }
import java.util.Scanner;
class Demo{
public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Character: ");
		int n=sc.nextInt();
		if(n%2==0){
			System.out.println("HiTwo");
		}
		if(n%5==0 ){
			System.out.println("HiFive");
		}
		// if(n%2==0 && n%5==0){
		// 	System.out.println("HiTwoHiFive");
		// }
	}
}
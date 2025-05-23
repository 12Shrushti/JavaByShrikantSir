import java.util.Scanner;
class TotalBill{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of piiza bought: ");
		int pizza = sc.nextInt();
		System.out.print("Enter the no of puffs bought: ");
		int puffs= sc.nextInt();
		System.out.print("Enter the coldDrinks bought: ");
		int coldDrink= sc.nextInt();


		double result=pizza*80+puffs*0.25+coldDrink*1.0;
		System.out.println("Total Price is: "+result);
	}
}
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


		int result=pizza*100+puffs*20+coldDrink*10;
		System.out.println(result);
	}
}
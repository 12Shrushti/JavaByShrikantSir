import java.util.Scanner;
class TruckDistance{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the no of liters to fil the tank: ");
		int litre= sc.nextInt();

		System.out.print("Enter the distnce covered: ");
		int dist =sc.nextInt();

		if(litre<=0 || dist<=0)
			System.out.println("Invalid Input");
		double litersPer100Km = (double) litre * 100 / dist;
        System.out.printf("Result: %.2f litre per 100 km\n", litersPer100Km);


		// System.out.printf("Result: %.2f (double)litre*100/dist\n",(double)litre*100/dist+" litre per km" );
		double gallons =litre*0.2642;

		double miles = dist*0.6214;
		System.out.println("In US result: "+miles/gallons);

	}
}
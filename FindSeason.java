import java.util.Scanner;
class FindSeason{
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.print("Enter the month: ");
		int opt =sc.nextInt();
		
		switch(opt){
		
		
		case 3:
		case 4:
		case 5:
			System.out.println("Season is Spring"); break;
		case 6:
		case 7:
		case 8:
			System.out.println("Season is Summer");break;
		case 9:
		case 10:
		case 11:
			System.out.println("Season is Autumn");break;
		case 12:
		case 1:
		case 2:
			System.out.println("Season is Winter");break;

		default:System.out.println("Invalid Month Entered");break;
		}
	}
}
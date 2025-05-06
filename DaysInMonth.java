import java.util.Scanner;
class DaysInMonth{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the month: ");
		String month =sc.next().toUpperCase();

		switch(month)
		{
		case "JANUARY":System.out.println("number of days are: 31");break;
		case "FEBRUARY":{
			System.out.print("Enter the year: ");
			int year = sc.nextInt();
			if(year%100==0 ||( year%4==0 && year%100!=0))
				System.out.println("number of days are: 29");
			else
			System.out.println("number of days are: 28");
			break;
		}
		case "MARCH":System.out.println("number of days are: 31");break;
		case "APRIL":System.out.println("number of days are: 30");break;
		case "MAY":System.out.println("number of days are: 31");break;
		case "JUNE":System.out.println("number of days are: 30");break;
		case "JULY":System.out.println("number of days are: 31");break;
		case "AUGUST":System.out.println("number of days are: 31");break;
		case "SEPTEMBER":System.out.println("number of days are: 30");break;
		case "OCTOBER":System.out.println("number of days are: 31");break;
		case "NOVEMBER":System.out.println("number of days are: 30");break;
		case "DECEMBER":System.out.println("number of days are: 31");break;
		default:System.out.println("INVALID MONTH ENTERED");break;		
		}
		
	}
}
import java.util.Scanner;
class Calender{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the date: ");
	    int date =sc.nextInt();
		System.out.print("Enter the month: ");
	    String monthCode =sc.next();
		switch(monthCode)
		{
         case "Jan":System.out.println("0"); break;
         case "Feb":System.out.println("3"); break;
         case "Mar":System.out.println("3"); break;
         case "Apr":System.out.println("6"); break;
         case "May":System.out.println("1"); break;
         case "Jun":System.out.println("4"); break;
         case "Jul":System.out.println("0"); break;
         case "Aug":System.out.println("2"); break;
         case "Sep":System.out.println("5"); break;
         case "Oct":System.out.println("0"); break;
         case "Nov":System.out.println("3"); break;
         case "Dec":System.out.println("5"); break;
         default:System.out.println("Invalid Month"); break;
	    }
		System.out.print("Enter the year: ");
	    int yearCode =sc.nextInt();
	    int year1 =yearCode/100;
	    switch(year1){
	    case 16:System.out.println("6");break;
	    case 17:System.out.println("4");break;
	    case 18:System.out.println("2");break;
	    case 19:System.out.println("0");break;
	    case 20:System.out.println("6");break;
	    case 21:System.out.println("4");break;
	    case 22:System.out.println("2");break;
	    default:System.out.println("Invalid year");break;
	    }
	 int year =yearCode%100;
	 int rem =year/4;
	 int str=Integer.valueOf(monthCode);
	 int sum=year+rem+yearCode+date+str;

	 int result = sum%7;

	 switch(result)
		{
		 case 1:System.out.println("Monday");break;
		 case 2:System.out.println("Tuesday");break;
		 case 3:System.out.println("Wednesday");break;
		 case 4:System.out.println("Thursday");break;
		 case 5:System.out.println("Friday");break;
		 case 6:System.out.println("Saturday");break;
		 case 0:System.out.println("Sunday");break;
		 default:System.out.println("Invalid");break;
		}

	}
}

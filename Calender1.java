import java.util.Scanner;
class Calender1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		String []day={"Sunday","Monday", "Tuesday", "Wednesday", "Thursday", " Friday","Saturday"};
		String month[]={"Jan" , "Feb" ,"March" , "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov","Dec"};
		int[] monthCode={0,3,3,6,1,4,6,2,5,0,3,5};
		int year[]={16,17,18,19,20,21,22};
		int[] yearCode={6,4,2,0,6,4,2};

		System.out.print("Enter the date: ");
		int date=sc.nextInt();

		System.out.print("Enter the month: ");
		String month1=sc.next();

		int month2=-1;
		for(int i=0 ;i<month.length; i++){
			if(month1.equals(month[i])){
				month2=monthCode[i];
				break;
			}
		}

		System.out.print("Enter the year: ");
		int year1=sc.nextInt();

		int centuryCode= year1/100;
		int year2=-1;
			for(int i =0;i<year.length; i++){
				if(year[i]==centuryCode){
					year2=yearCode[i];
					break;
				}
			}
		boolean isLeap= (year1%4==0 && year1%100 != 0) ||(year1%400 ==0);
		int lastDigit =year1%100;
		int div = lastDigit/4;

		int sum =0;
		if(isLeap){
			sum=date +month2 +lastDigit +div+year2-1;
		}else{
			sum= date +month2 +lastDigit +div+year2;
		}
		
		int result = sum%7;

		System.out.println(day[result]);
	}
}
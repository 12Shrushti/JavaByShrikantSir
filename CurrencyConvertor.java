import java.util.Scanner;
class CurrencyConvertor{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("     WELCOME   ");

		System.out.println();
		System.out.println("1. USD");
		System.out.println("2. EURO");
		System.out.println("3. GDP");
		System.out.println("4. AUD");
		System.out.println("5. JPY");

		System.out.println();

		System.out.println("Enter your response: ");
		String str =sc.next().toUpperCase();

		System.out.println("Enter the amount in INR");
		float inr = sc.nextFloat();

		float converted =0;
		String curr ="VALID";

		switch(str)
		{
		case "USD" :converted = inr / 85.5165f ;      break ;
		case "EURO":converted = inr / 97.4713f ;      break ;
		case "GDP" :converted = inr / 112.308f ;      break ;
		case "AUD" :converted = inr / 56.732f  ;      break ;
		case "JPY" :converted = inr / 0.578f   ;      break ;
		default: System.out.println("INVALID Currency Entered");
			curr ="NotValid";
			break;
		}
		if(curr.equals("VALID"))
			System.out.println(inr + " INR " +converted+ " "+ str);
	}
}
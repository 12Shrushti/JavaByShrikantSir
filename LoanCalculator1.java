import java.util.*;
class LoanCalculator1
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	for( ; ;)
	{
		System.out.println("     LOAN CALCULATOR   ");
	    System.out.println();
        System.out.println("1. Home Loan");
	    System.out.println("2. Gold Loan");
		System.out.println("3. Vehical Loan");
		System.out.println("4. Education Loan");
	    System.out.println("5. Personal Loan");
		System.out.println();

		System.out.println("Enter Your Option: ");
		int opt=sc.nextInt();
		System.out.println();
		double roi =0;
		String loanType= null;
		String assum = "VALID";

		switch(opt)
		{
		    case 1:{
		    	loanType= "Home Loan";
		    	roi =8.45;
		    	break;
		     }
		     case 2:{
		    	loanType= "Gold Loan";
		    	roi =3;
		    	break;
		     }
		     case 3:{
		    	loanType= "Vehical Loan";
		    	roi =12;
		    	break;
		     }
		     case 4:{
		    	loanType= "Education Loan";
		    	roi =9.5;
		    	break;
		     }
		     case 5:{
		    	loanType= "Personal Loan";
		    	roi =16;
		    	break;
		     }
		    default:{
		    	System.out.println("Invalid Option");
		    	assum="NOTVALID";
		    	break;
		    }
		}	
	if(assum =="NOTVALID")
		continue;   //terminate

	//Calculation
	System.out.println("Enter the Amount: ");
	double amount =sc.nextDouble();

	if(amount< 10000 || amount>5000000)
	{
		System.out.println("Invalid Amount Entered");
		continue;
	}
	System.out.println("Enter the tenure in years: ");
	double tenure=sc.nextDouble();
	if(tenure<1 || tenure>20)
	{
		System.out.println("Invalid Tenure");
		continue;
	}
	System.out.println();
	System.out.println("Loan Type: "+loanType);
	System.out.println("Principal Amount: "+ amount+"rs");
	System.out.println("Rate Of Interest: "+ roi+"%");
	System.out.println("Tenure: "+tenure+"yrs");

	double interest =(amount *roi/100)*tenure;
	System.out.println("Interest: "+interest+"rs");
	System.out.println("Total loan Amount: "+(amount+interest));
	System.out.println("EMI: "+(amount+interest)/(tenure*12));
	}




	}
}
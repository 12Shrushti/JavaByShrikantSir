import java.util.Scanner;
class ChangeCase{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.next();
		for(int i=0;i<=str.length()-1; i++){
			char ch = str.charAt(i);
			if(ch>='a' && ch<='z')
			str =str.toUpperCase();
			else if(ch>='A' && ch<='Z')
			str = str.toLowerCase();
			else 
				str =str;
		}

			

		
		System.out.println("After changes String is: "+str);
	}
}
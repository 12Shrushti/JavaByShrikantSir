import java.util.*;
class StringEx{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the First String: ");
		String s1= sc.next();
		System.out.print("Enter the Second String: ");
		String s2= sc.next();

		String newString=s1.substring(0,1).toUpperCase() + s1.substring(1);
		String newString2= s2.substring(0 , 1).toUpperCase()+ s2.substring(1);
		// System.out.println(newString);
		// System.out.println(newString2);
		System.out.println("MY NAME IS: "+newString + " "+ newString2);
	}
}
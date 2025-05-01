// class UpperCase{
// 	public static void main(String[] args) {
// 		for(char ch='A'; ch<='Z'; ch++)
// 			System.out.print(ch +" ");
// 	}
// }

// LowerCase ALong with ascii value

// class UpperCase{
// 	public static void main(String[] args) {
// 		for(char ch='a'; ch<='z'; ch++)
// 			System.out.print(ch+":"+(ch+0));
// 	}
// }


//print digit with ASCII value
// class UpperCase{
// 	public static void main(String[] args) {
// 		for(char i ='0'; i<='9' ;i++)
// 			System.out.println(i+":"+(i+0));
// 	}
// }


// print given series    a,c,e,g,i,k,....

// class UpperCase{
// 	public static void main(String[] args) {
// 		for(char ch ='a' ;ch<='z'; ch++){
// 			if(ch%2==0)
// 				continue;
// 			System.out.print(ch+" ");
// 		}
// 	}
// }



// print given series as   a,c,f,j,o,u....
// class UpperCase{
// 	public static void main(String[] args) {
// 		char a=1;
// 		for(char ch ='a' ;ch<='z'; ch+=a){
// 			System.out.print(ch+" ");
// 			a++;
// 		}
// 	}
// }


// print the vowels from user entered string
import java.util.Scanner;
class UpperCase{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the name: ");
	String str = sc.next();

	char ch[] =str.toCharArray();
		for(int c =0; c<=ch.length-1; c++){
			if(ch[c]=='a' || ch[c]=='o' || ch[c]=='e' || ch[c]=='i' || ch[c]=='u')
				System.out.print(ch[c]+", ");
		}
	}
}
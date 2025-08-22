import java.util.*;
class ReverseString{
	public static void main(String[] args) {
		String str ="abcba";
		// char []arr = str.toCharArray();
		// System.out.println(Arrays.toString(arr));


		// for(int i=arr.length-1 ;i>=0 ;i--){
		// 	System.out.print(arr[i]);
		// }


		String str1 = "";
		for(int i=str.length()-1; i>=0 ;i--){
			str1 +=str.charAt(i);
		}
		System.out.println("Reverse : "+str1);


		if(str.equals(str1))
			System.out.println("String is Palindrome");
		else 
			System.out.println("String is Not Palindrome");




	}
}
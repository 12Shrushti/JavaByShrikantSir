import java.util.*;
class FactorialOfLarge{
	public static void main(String[] args) {
		int arr[] ={8,4,5,2,1};
		Arrays.sort(arr);
		int max= arr[arr.length-1];
		int fact=1;
		for(int i=1;i<=max; i++){
			fact*=i;

		}
		System.out.print("Largest Number is: "+max+" and ");
		System.out.println("Factorial of Largest element is: "+fact);

	}
}
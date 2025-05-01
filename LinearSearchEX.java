import java.util.Scanner;
class LinearSearchEX{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the element you want to find: ");
		int element = sc.nextInt();
		int arr[] ={2,6,7,9,23,45,67,32};
		LinearSearch(arr , element);


		// if(LinearSearch(arr, element))
		// 	System.out.println("ELEMENT FOUND");
		// else 
		// 	System.out.println("ELEMENT NOT FOUND");

		
	}
	public static void LinearSearch(int arr[] , int element){
		for(int i=0; i<=arr.length-1; i++){
			if(arr[i]==element){
				System.out.println(element +" FOUND AT INDEX "+i);
				return ;
			}
			
		}
		System.out.println("ELEMENT NOT FOUND");
				// return true;
		
		// return false;
	}
}
import java.util.*;
class FindDuplicatesInArr
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array: ");
		int arr[] = new int[10];
		
		for(int i=0; i<arr.length; i++){
			arr[i]= sc.nextInt();
			// System.out.print(arr[i]+ " ");
		}
		Arrays.sort(arr);
		System.out.print("Duplicates Elements Are: ");
		for(int i=0; i<arr.length-1 ; i++)
		{
			if(arr[i]==arr[i+1])
				System.out.print(arr[i]+" ");	
	 	}
		
		

	}
}
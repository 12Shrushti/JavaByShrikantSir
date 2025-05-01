import java.util.*;
class ContainsDuplicate{
	public static void main(String[] args) 
	{
		int []arr = {1,2,3,4,5,6,7,2,1,2,4};
		if (isDuplicate(arr)) 
			System.out.println("Yes, it Contains Duplicate");
		else 
			System.out.println("No , it doesnt Contains Duplicates");
     
	}
	
	
	public static boolean isDuplicate(int [] arr)
	{
		
		for(int i =0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length-1; j++){
				if(arr[i]==arr[j])
					return true;
			}
		}

	return false;

	

	}
}

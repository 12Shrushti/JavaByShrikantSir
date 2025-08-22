import java.util.*;
class SmallestInArr{
	public static void main(String[] args) {
		int []arr ={90,20,10,30,45,76,5,22};
		int large=arr[0]; 
 
		for(int i=0; i<arr.length;i++){
			if(arr[i]>large)
		    //30<10
			{
				large = arr[i]; //10
			}

		}
		System.out.println(large);
	}
}

import java.util.*;
class EvenInArr{
	public static void main(String[] args) {
		int []arr={1,2,3,4,5};
		int even=0; //1
		int odd=0;//3
		for(int i=0;i<arr.length ;i++){
			if(arr[i]%2==0)
				even++;//2
			else 
				odd++;
		}

		System.out.println("Count of even Numbers: "+even);
		System.out.println("Count of odd number: "+odd);

	}
}





// 3)Find second largest element from an array
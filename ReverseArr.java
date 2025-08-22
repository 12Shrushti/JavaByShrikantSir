import java.util.*;
class ReverseArr{
	public static void main(String[] args) {
		int [] num ={3,4,5,6,1,2,9};
		System.out.println(Arrays.toString(num));


		for(int i=num.length-1; i>=0 ;i--){
			System.out.print(num[i]+" ");
		}


	}
}
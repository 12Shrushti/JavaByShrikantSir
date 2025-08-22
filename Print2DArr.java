import java.util.*;
class Print2DArr{
	public static void main(String[] args) {
		int [][]arr ={{10,20,30} , {40,50}};
		for(int[] ele : arr){
			for(int i : ele){
				System.out.println(i+" ");
			}
			System.out.println();
		}
		
	}
}



int []arr1 ={10,20,30,40,50};
int []arr2 ={60,70,80};
int []arr3 =new int[arr1.length +arr2.length];
arr3 ={10,20,30,40,50,60,70,80}


// WAJP to print elements from 2D array.
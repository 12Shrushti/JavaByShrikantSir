import java.util.*;
class CommonELe{
	public static void main(String[] args) {
		int arr1[] ={2,3,4,6,1,7,8,5};
		int arr2[]={12,10,9,2,1};
		int arr3[]={43,23,1,9,0,11,2,19,78};
		int l1 =arr1.length ,l2=arr2.length, l3=arr3.length;
		int i=0,j=0,k=0;
	   while(i<0 && j<0 && k<0){
	   	if(arr1[i]==arr2[j]){
	   		System.out.println(arr1[i]);
	   		System.out.println(arr2[j]);
	   	}
	   	else if(arr2[j] == arr3[k])
	   	{
	   		System.out.println(arr2[j]);
	   		System.out.println(arr3[k]);
	   	}
	   	
	   }

	}
}
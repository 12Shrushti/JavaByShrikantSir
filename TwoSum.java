import java.util.*;
class TwoSum{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the target sum: ");
	int target =sc.nextInt();
	int nums[]={3,4,5,6};
	int result[]=twoSumEle(nums, target);
	System.out.println(result[0]);
	
	}
	public static int[] twoSumEle(int []nums , int target){
	
	for(int i=0;i<nums.length; i++)
	{
		for(int j=i+1; j<nums.length; j++){
			if(nums[i]+nums[j]==target){
				return new int[]{i ,j};
			}
		}

	}	
	return new int[0];
	}
}
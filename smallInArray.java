import java.util.Scanner;
class smallInArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.print("Enter the number: ");
		int []arr={25,60,91,20,45,36,70};
		int small=arr[0];

		for(int i=0;i<=arr.length-1; i++){
			if(arr[i]<small){
				small=arr[i];
			}
		}
		System.out.println(small);
	}
}
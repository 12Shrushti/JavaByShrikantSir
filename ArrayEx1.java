import java.util.*;
class ArrayEx1{
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		// System.out.println(Arrays.toString(arr));
		int cnt=0;
		for (int ele :arr ) {
			cnt++;
		}
		System.out.println(cnt);
	}
}
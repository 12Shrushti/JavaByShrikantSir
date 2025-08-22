import java.util.*;
class FrequencyEleArr{
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,1,4};
		boolean []b= new boolean[arr.length];
		// Arrays.sort(arr);
	// System.out.println(Arrays.toString(b));

		for(int i=0; i<arr.length ;i++){
			if(b[i])
				continue;
			int cnt=0;
			for(int j=0; j<arr.length ;j++){
				if(arr[i] == arr[j] && b[j]==false){
					cnt++;
					b[j]= true;
				}
			}
			
			System.out.println(arr[i]+ " : "+cnt);
		}
	}
}

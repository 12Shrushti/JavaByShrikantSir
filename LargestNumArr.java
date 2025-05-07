class LargestNumArr{
	public static void main(String[] args) {
		int arr[] = {20,44,5,23,109,46};
		int large=arr[0];
		for(int i=0; i<=arr.length-1; i++){
			if(arr[i] > large){
				large= arr[i];
			}
		}
		System.out.println("Largest Number from an array is: "+large);
	}
}
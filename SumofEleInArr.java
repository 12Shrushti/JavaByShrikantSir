class SumofEleInArr{
	public static void main(String[] args) {
		int arr[] ={1,2,3,4,5,6,7,8,9};
		int sum=0;
		for(int ele: arr){
			sum+=ele;
		}
		System.out.println("Sum of Elements from array is: "+sum);
	}
}
class SumOfArr{
	public static void main(String[] args) {
		int []arr={1,2,3,5,5,5,5};
		int cnt=0;//1
		// for(int i=0; i<=arr.length;i++){
		// 	cnt =cnt+arr[i];//1+2=3

		// }
		// System.out.println(cnt);
		for(int a: arr){
			cnt+=a;
		}
		System.out.println(cnt);

	}
}
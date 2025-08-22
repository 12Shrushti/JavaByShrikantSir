class AssesmentEx{
	public static void main(String[] args) {
		int []arr={2,3,4,1};
		int sum=0;
		for(int i=0; i<arr.length ;i++)
		{
			if(arr[i] ==1){
				break;
			}
			if(isPrime(arr[i]) && i%2!=0){
				sum +=arr[i];
			}
		}
		System.out.println(sum);
	}
	public static boolean isPrime(int num){
		int cnt=0;

		for(int i=1; i<=num;i++)

			if(num%i==0){
				cnt++;
			}
		
		if(cnt>2)
			return false;

		return true;
	}
}
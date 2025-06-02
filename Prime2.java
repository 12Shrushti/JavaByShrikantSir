class Prime2{
	public static void main(String[] args) {
		int num=100;
		int start=1;
		int end =num;
		for(int i=start ;i<=end ;i++)
			if(isPrime(i))
				System.out.print(i+" ");
		

}
	 public static boolean isPrime(int num){
		int cnt=0;
		for(int i=1; i<=num;i++)
			if(num%i==0)
				cnt++;
		
		if(cnt>2)
			return false;

		return true;
	}
}
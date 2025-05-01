class PrimeIn1To100{
	public static void main(String[] args) {
		int a =1;
		int b=100;
		for(int i=a; i<=b; i++){
			if(isPrime(i));
			System.out.println(i);
		}	
	}
	public static boolean isPrime(int n){
		for(int i=1;i<=n/2 ;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}
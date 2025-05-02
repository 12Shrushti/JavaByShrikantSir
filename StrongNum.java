class StrongNum{
	public static void main(String[] args) {
		int num=145,rev=0,sum=0;
		int temp = num;
		while(num!=0){
			int rem=num%10;
			int fact=1;
			for(int i=1; i<=rem ;i++){
				fact *=i;
			}
			
			sum +=fact;
			num/=10;
		}
		System.out.println(sum);
		
		if(sum == temp)
			System.out.println("Strong Number");
		else 
			System.out.println("Not Strong Number");
	}
}
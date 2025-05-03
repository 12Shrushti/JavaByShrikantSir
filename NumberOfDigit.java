class NumberOfDigit{
	public static void main(String[] args) {
		int num=123455676, rem =0,digit=0;
		int temp=num;

		while(num!=0){
			rem=num%10;
			digit++;
			num/=10;

		}
		System.out.println("number of digit in "+temp+ " is "+digit);
	}
}
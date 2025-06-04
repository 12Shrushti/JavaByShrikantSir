class TcsPrep4{
	public static void main(String[] args) {
		int num=12324;
		int rev=0;
		int rem=0;
		int temp=num;
		while(num!=0){
			rem =num%10;
			rev =rev *10 +rem;
			num/=10;
		}
		if(rev == temp)
			System.out.println(temp+" is Palindrome");
		else 
			System.out.println(temp+" is not Palindrome");
	}
}
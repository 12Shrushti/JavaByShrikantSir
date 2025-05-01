class Palindrome{
	public static void main(String[] args) {
		int n=12321;
		int rev=0;
		int temp=n;
		while(n>0){
			rev = rev *10 +(n%10);
			n/=10;
		}
		System.out.println(temp==rev ? temp+ " is Palindrome" : temp+ " is not Palindrome");
	}
}
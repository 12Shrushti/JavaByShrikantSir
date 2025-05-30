class SwapTwoNum{
	public static void main(String[] args) {
		int a =5 ,b= 9 ;
		System.out.println("Before Swapping a: "+a);
		System.out.println("Before Swapping b: "+b);
		int temp= a;
		a=b;
		b=temp;
		System.out.println("--------------------------------------------");
		System.out.println("After Swapping a: "+a);
		System.out.println("After Swapping b: "+b);
	}
}
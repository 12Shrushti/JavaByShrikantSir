class SwapWithoutTemp{
	public static void main(String[] args) {
		int a= 9, b=4;
		System.out.println("Before swap a: "+a);
		System.out.println("Before swap b: "+b);
		a= a+b;
		b=a-b;
		a=a-b;
		System.out.println("----------------------------------------------");
		System.out.println("After swap a: "+a);
		System.out.println("After swap b: "+b);
	}
}
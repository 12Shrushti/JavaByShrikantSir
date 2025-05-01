class LCM{
	public static void main(String[] args) {
		// int n1=36,n2 =60,lcm =0;
		// int max =n1 >n2 ? n1 : n2;
		// for(int i=max; i<=n1*n2; i++)
		// {
		// 	if(i%n1==0 &&i%n2==0)
		// 	{
		// 		lcm=i;
		// 		break;
		// 	}
		// }
		// System.out.println(lcm);


//method 2 by using formula
		int n1= 36;
		int n2= 60;
		int hcf =1;
		
		for(int i=1; i<=n1||i<=n2 ;i++){
			if(n1%i==0 && n2%i==0){
				hcf=i;	
			}
		}
		// System.out.println(hcf);	
		int lcm =(n1 * n2)/hcf;
		System.out.println("LCM is : "+lcm);

	}
}
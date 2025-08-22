class ArrayEx4{
	public static void main(String[] args) {
		int []arr ={71, 8, 9 , 153 , 70, 371};
		for(int ele : arr){
			if(isArmStrong(ele)){
				System.out.println(ele+ " ");
			}
		}
	}
	public static boolean isArmStrong(int ele){
		int pow = findLength(ele);
		int sum=0;
		 for(int i=ele ; i>0 ;i/=10){
		 	int dgt = i%10; //1
		 	sum += findPower(dgt ,pow);
		 }
		 return ele ==sum;
	}
//                                  1,     2
	public static int findPower(int dgt , int pow){
		int op= 1;
		for(int i=1; i<=pow ; i++){
			op = op*dgt;//1*1
		}
		return op;


	}
	public static int findLength(int ele){
		int cnt=0;
		while( ele !=0){
			int rem=ele%10;//
			cnt++;
			ele/=10;
		}
		return cnt;

	}
}
class PalnidromeArrString{
	public static void main(String[] args) {
		String [] arr ={"nitin", "nayan" , "ramesh" ,"naman" ,"madam" ,"ganesh"};

		for(String ele : arr){
			if(isPalindrome(ele))
				System.out.println(ele+""); 
		}

		
	}
	public static boolean isPalindrome(String ele){
		String rev ="";
		for(int i=ele.length()-1 ; i>=0;i--){
			rev += ele.charAt(i);
		}

		return ele.equals(rev);


	}
}
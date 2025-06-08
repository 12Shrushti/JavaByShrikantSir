class CountVowels{
	public static void main(String[] args) {
		String str = "Hello world";
		str =str.toLowerCase();

		int count=0;
		for(int i=0; i<=str.length()-1; i++){
			char ch=str.charAt(i);
			if(ch=='i' || ch=='a' || ch=='e' || ch=='o' || ch=='u')
				count++;
		}
		System.out.println(count);
	}

}
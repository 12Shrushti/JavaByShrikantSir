class Pattern6{
	public static void main(String[] args) {
		int a=3;
		for(int i=a; i<=5; i++){
			for(int j=1; j<=5; j++){
				for(int k=1 ; k==i; k++){
					System.out.println();
					// continue;
				}
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
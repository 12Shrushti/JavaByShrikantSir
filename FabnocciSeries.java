class FabnocciSeries
{
	public static void main(String[] args) {
		int num=10, start=0,end=1,sum=0;
		for(int i=1;i<=num; ++i){
			System.out.print(start+" ");

			sum=start+end;
			start=end;
			end=sum;
		}
	}
}
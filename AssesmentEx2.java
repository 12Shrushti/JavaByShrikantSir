import java.util.*;
class AssesmentEx2{
	public static void main(String[] args) {
		int n=3;
		int q=4;
		int [] d ={50,55,60};
		int[] td= {60,55,50,65};
		int op[] =solve(n ,q,d, td);
		System.out.println(Arrays.toString(op));

	}
	private static int[] solve(int n,int q ,int[] d ,int[]td){
		int[] op = new int[q];
		int indx =0;
		for(int i: td){
			int sum=0;
			for(int j: d){
				int a =i-j;
				sum += a<0 ? a*-1 : a;
			}
			op[indx++] =sum;
		}
		return op;
	}
}
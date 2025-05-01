import java.util.Scanner;
class PrimeInRange{
	public static void main(String[] args) {
		int range=1;
		int upto = 10;
		for(int i=range; i<=upto; i++)
			if(isPrime(i))
				System.out.print(i+ " ");
	}
	public static boolean isPrime(int num){
		for(int i=1; i<=num; i++){
			if(num%i ==0)
				return false;
		}
		return true;

	}
}
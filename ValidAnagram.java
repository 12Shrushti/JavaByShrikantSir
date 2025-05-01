import java.util.*;
class ValidAnagram{
	public static void main(String[] args){
		String str1="carrace";
		String str2="racecar";

		if(Anagram(str1, str2))
			System.out.println("Anagram");
		else 
			System.out.println("not Anagram");


	}
	public static boolean Anagram(String str1 ,String str2){
		if(str1.length() != str2.length())
			return false;
		char []at =str2.toCharArray();
		char []st=str1.toCharArray();
		Arrays.sort(at);
		Arrays.sort(st);
		return Arrays.equals(st ,at);

	}
}
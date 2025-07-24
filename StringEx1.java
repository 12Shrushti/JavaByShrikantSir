import java.util.*;
class StringEx1{
	public static void main(String[] args){
		String str ="Hello world";
		char []ch = str.toCharArray();
		System.out.println(Arrays.toString(ch));
		String str2 = "How are you";
		System.out.println(str.concat(" "+str2));
	}
 }
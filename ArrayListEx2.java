import java.util.*;
class ArrayListEx2{
	public static void main(String[] args) {
		// int arr[] ={20,60,46, 34, 89,12,23};
		// Arrays.sort(arr);
		// System.out.println(Arrays.toString(arr));

		// ArrayList<Integer> num = new ArrayList<>();
		// num.add(20); 
		// num.add(60);
		// num.add(46);
		// num.add(34);
		// num.add(89);
		// num.add(12);
		// num.add(23);
		// System.out.println(num);

		// Collections.sort(num); 


		// for(int i: num)
		// {
		// 	System.out.println(i);
		// }


		ArrayList<String> str = new ArrayList<>();
		str.add("srushti");
		str.add("neha");
		str.add("snehal");
		str.add("rutuja");
		str.add("arun");
		str.add("soham");
		str.add("namrata");
		str.add("sayali");
		str.add("sneha");
		System.out.println(str);

		Collections.sort(str);
		for(String ele: str){
			System.out.println(ele);
		}
	}
}
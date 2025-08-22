import java.util.ArrayList;
class ArrayListEx{
	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("BMW");
		obj.add("Ford");
		obj.add("Volvo");
		obj.add("KIA");
		System.out.println(obj);

		System.out.println("----------------");

		obj.add(3, "rolls royce"); //add elements at the 3rd index
		System.out.println(obj);

		System.out.println("--------------");

		System.out.println(obj.get(3));

		System.out.println("-----------------");

		obj.remove(1);        //for removing elements from 1 index
		System.out.println(obj);


		System.out.println("------------------");


		 //for finding the length of given arraylist
		System.out.println(obj.size());


		

	}
}
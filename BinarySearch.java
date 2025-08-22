class BinarySearch{
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70,80,90};
		int key =90;
		int pos =MethodBinarySearch(arr,0,arr.length-1,key);
		if(pos != -1){
			System.out.println(key +" found at "+pos);
		}else
		{
			System.out.println(key + " not found");
		}
	}

	public static int MethodBinarySearch(int []arr , int key, int min, int max){
		 min =0;
		max = arr.length-1;
		// while(min <= max){
			int mid = (max+min)/2;
			// if(key <arr[mid])
			// 	max = mid-1;
			// else if(key>arr[mid])
			// 	min= mid+1;
			// else 
			// 	return mid;
			if (key == arr[mid]) {
            return mid; // Key found
        } else if (key < arr[mid]) {
            return MethodBinarySearch(arr, min, mid - 1, key); // Search in left half
        } else {
            return MethodBinarySearch(arr, mid + 1,max, key); // Search in right half
        }
		// }
		// return -1;

	}
}




// public class RecursiveBinarySearch {

    // Recursive Binary Search Method
//     public static int binarySearch(int[] arr, int low, int high, int key) {
//         if (low > high) {
//             return -1; // Key not found
//         }

//         int mid = (low + high) / 2;

//         if (key == arr[mid]) {
//             return mid; // Key found
//         } else if (key < arr[mid]) {
//             return binarySearch(arr, low, mid - 1, key); // Search in left half
//         } else {
//             return binarySearch(arr, mid + 1, high, key); // Search in right half
//         }
//     }

//     // Main method
//     public static void main(String[] args) {
//         int[] arr = new int[10];

//         // Filling array with values 0, 10, 20, ..., 90 (based on your notes)
//         for (int i = 0, j = 0; i < arr.length; i++, j += 10) {
//             arr[i] = j;
//         }

//         int key = 30; // Key to search
//         int pos = binarySearch(arr, 0, arr.length - 1, key);

//         if (pos != -1) {
//             System.out.println(key + " found at index: " + pos);
//         } else {
//             System.out.println(key + " not found");
//         }
//     }
// }
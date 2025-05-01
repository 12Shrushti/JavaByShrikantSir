class MaxOfArr{
	public static void main(String []args)
	{
        int [] arr ={5,7,2,1,9,6};
        int max =arr[0];

        for(int i =0; i<=arr.length-1 ; i++){
        	if(arr[i]> max)
        	{
        		max = arr[i];
        	}
        }
        System.out.println(max + " is the maximum number of an array");
	}
}
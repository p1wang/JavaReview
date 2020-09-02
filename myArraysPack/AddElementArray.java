package myArraysPack;

public class AddElementArray{

	public static int[] addElement(int[] arr, int ele, int n){
		int[] newArray = new int[n+1];	// declare and allocate memory

		for(int i=0;i<n;i++){
			newArray[i] = arr[i];
		}
		newArray[n] = 5;


		return newArray;
}

	
	public static void main(String args[]) {
	   	int[] arr = {1,2,3,4};

	   	int ele = 10;

	   	int[] returnedArr = addElement(arr, ele, arr.length); // length is for counting arrays, length() is for counting string class related objects

	   	for(int i:returnedArr){
	   		System.out.println(i);
	   	}
   }
}





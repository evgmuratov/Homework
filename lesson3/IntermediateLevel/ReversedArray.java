package IntermediateLevel;

public class ReversedArray {
	public int[] reverseArray(int[] array){
		int[] resultArray=new int[array.length];
		int i;
		for (i=0; i<array.length; i++){
			resultArray[i]=array[array.length-i-1];
		}
		return resultArray;
	}

	public static void main(String[] args) {
		ReversedArray myArray=new ReversedArray();
		int[] inputArray={1,2,3,4,5,6};
		int[] outputArray;
		outputArray=myArray.reverseArray(inputArray);
		int i;
		for (i=0; i<outputArray.length; i++){
			System.out.print(" "+outputArray[i]);
		}
	}

}

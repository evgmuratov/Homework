package BeginnerLevel;

public class Task1 {
	public static void multiply (int[] array){
		int[] resArray=new int[array.length];
		int i;
		for (i=0; i<array.length; i++){
			resArray[i]=3*array[i];
			System.out.print(resArray[i]+" ");
		}
				
	}

	public static void main(String[] args) {
		int[] myArray={10,11,12};
		Task1.multiply(myArray);

	}

}

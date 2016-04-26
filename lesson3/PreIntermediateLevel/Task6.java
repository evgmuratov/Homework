package PreIntermediateLevel;

public class Task6 {
	public static void sumArray(int[] array){
		int sumRes=0;
		for (int i=0; i<=array.length-1; i++){
			sumRes=sumRes+array[i];
		}
		float aveRes=(float)sumRes/(array.length);
		System.out.println(sumRes);
		System.out.println(aveRes);
	}
		public static void main(String[] args) {
			int newArray[]={11,22,33,44,55,66};			
			Task6.sumArray(newArray);
	}

}
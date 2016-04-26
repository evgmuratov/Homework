package PreIntermediateLevel;
public class Task5 {
	public static boolean checkArray(int[] array){
		int length=array.length-1;
		boolean result=true;
		for (int i=0; i<=length; i++){
			if (array[i]==7 || array[i]==9){
				result=false;
			}
		}
		return result;
	}
		public static void main(String[] args) {
			int newArray[]={7,5,31,41,2,65};
			System.out.println(Task5.checkArray(newArray));
	}

}
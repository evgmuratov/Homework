package PreIntermediateLevel;
public class Task4 {
	public static void printArray(int[] array){
		int length=array.length-1;
		if (length%2==0){
			for (int i=length/2; i<=length; i++){
				System.out.println(array[i]);
			}
		}else{
			for (int i=(length+1)/2; i<=length; i++){
				System.out.println(array[i]);
			}
		}
	}
		public static void main(String[] args) {
			int newArray[]={14,21,31,41,55,65};
			Task4.printArray(newArray);
	}

}

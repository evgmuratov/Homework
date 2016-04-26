package BeginnerLevel;
public class Task7 {
	static int array1[]={4,2,4,10};
	static int array2[]={3,5,2,7,3,3};
	public static int getMax(int array[]){
		int max=array[0];
		int i;
		for (i=0; i<array.length; i++){
			if (max<array[i]){
				max=array[i];
			}
		}
		return max;
		}
			public static void main(String[] args) {
		System.out.println(Task7.getMax(array2));
	}
}

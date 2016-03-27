package BeginnerLevel;
public class Task7 {
	static int array1[]={4,2,4,10};
	static int array2[]={3,5,2,7,3,3};
	public int getMax(int array[]){
		int max=array[0];
		int i;
		for (i=0; i<array.length; i++){
			if (max<array[i]){
				max=array[i];
			}else{}
		}
		return max;
		}
			public static void main(String[] args) {
		Task7 myMax=new Task7();
		int result;
		result=myMax.getMax(array2);
		System.out.println(result);
	}
}

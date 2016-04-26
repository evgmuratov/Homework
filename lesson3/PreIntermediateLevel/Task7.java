package PreIntermediateLevel;
public class Task7 {
	public static void minMaxValue(int[] array){
		int max=array[0];
		int min=array[0];
		for (int i=0; i<=array.length-1; i++){
			if (max<array[i]){
				max=array[i];
			}else if (min>array[i]){
				min=array[i];
			}else{}
		}
		System.out.println("Double multiple max("+max+")value is "+max*2);
		System.out.println("Double multiple min("+min+")value is "+min*2);
	}
	public static void main(String[] args) {
		int newArray[]={11,22,33,44,55,66};
		Task7.minMaxValue(newArray);
	}

}

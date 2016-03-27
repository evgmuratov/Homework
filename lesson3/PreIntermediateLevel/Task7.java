package PreIntermediateLevel;
public class Task7 {
	public void minMaxValue(int[] array){
		int length=array.length-1;
		int i;
		int max=array[0];
		int min=array[0];
		for (i=0; i<=length; i++){
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
		Task7 myArray=new Task7();
		int newArray[]=new int[6];
		newArray[0]=11;
		newArray[1]=22;
		newArray[2]=33;
		newArray[3]=44;
		newArray[4]=55;
		newArray[5]=66;
		myArray.minMaxValue(newArray);
	}

}

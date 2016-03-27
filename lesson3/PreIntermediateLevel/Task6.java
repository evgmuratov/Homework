package PreIntermediateLevel;

public class Task6 {
	public int sumArray(int[] array){
		int length=array.length-1;
		int i;
		int sumRes=0;
		for (i=0; i<=length; i++){
			sumRes=sumRes+array[i];
		}
		return sumRes;
	}
	public float aveArray(int[] array){
		int length=array.length-1;
		int i;
		float aveRes;
		int sumRes=0;
		for (i=0; i<=length; i++){
			sumRes=sumRes+array[i];
		}
		aveRes=(float)sumRes/(length+1);
		return aveRes;
	}
		public static void main(String[] args) {
			Task6 myArray=new Task6();
			int newArray[]=new int[6];
			newArray[0]=11;
			newArray[1]=22;
			newArray[2]=33;
			newArray[3]=44;
			newArray[4]=55;
			newArray[5]=66;
			System.out.println(myArray.sumArray(newArray));
			System.out.println(myArray.aveArray(newArray));
	}

}
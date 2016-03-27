package PreIntermediateLevel;
public class Task5 {
	public boolean checkArray(int[] array){
		int length=array.length-1;
		int i;
		boolean result=true;
		for (i=0; i<=length; i++){
			if (array[i]==7 || array[i]==9){
				result=false;
			}else{}
		}
		return result;
	}
		public static void main(String[] args) {
			Task5 myArray=new Task5();
			int newArray[]=new int[6];
			boolean res;
			newArray[0]=14;
			newArray[1]=5;
			newArray[2]=31;
			newArray[3]=41;
			newArray[4]=2;
			newArray[5]=65;
			res=myArray.checkArray(newArray);
			System.out.println(res);
	}

}
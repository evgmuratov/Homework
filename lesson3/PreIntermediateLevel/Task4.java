package PreIntermediateLevel;
public class Task4 {
	public void printArray(int[] array){
		int length=array.length-1;
		int i;
		if (length%2==0){
			for (i=length/2; i<=length; i++){
				System.out.println(array[i]);
			}
		}else{
			for (i=(length+1)/2; i<=length; i++){
				System.out.println(array[i]);
			}
		}
	}
		public static void main(String[] args) {
			Task4 myArray=new Task4();
			int newArray[]=new int[6];
			newArray[0]=14;
			newArray[1]=21;
			newArray[2]=31;
			newArray[3]=41;
			newArray[4]=55;
			newArray[5]=65;
			myArray.printArray(newArray);
	}

}

package PreIntermediateLevel;
public class Task11 {
	public boolean boundaryCheck(int[] array){
		boolean result=false;
		int i;
		int k=1;
		for (i=0; i<array.length; i++){
			if (array[i]>0){
				k=k+0;
			}else{
				k=k+1;
			}
		}
		if (k==1){
			result=true;
		}else{}
		return result;
	}
	public boolean sequence(int array[]){
		boolean result=false;
		int i;
		for (i=0; i<array.length-2; i++){
			if (array[i]==1 && array[i+1]==2 && array[i+2]==3){
				result=true;
			}else{}
		}
		return result;
	}
	public static void main(String[] args) {
		Task11 myArray=new Task11();
		int[] newArray=new int[6];
		newArray[0]=3;
		newArray[1]=2;
		newArray[2]=1;
		newArray[3]=5;
		newArray[4]=3;
		newArray[5]=6;
		myArray.boundaryCheck(newArray);
		if (myArray.boundaryCheck(newArray)==true){
			myArray.sequence(newArray);
			System.out.println(myArray.sequence(newArray));
		}else{
			System.out.println("It should be only positive numbers in array");
		}

	}

}

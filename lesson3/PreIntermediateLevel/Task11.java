package PreIntermediateLevel;
public class Task11 {
	public static boolean boundaryCheck(int[] array){
		boolean result=false;
		int k=1;
		for (int i=0; i<array.length; i++){
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
	public static boolean sequence(int array[]){
		boolean result=false;
		for (int i=0; i<array.length-2; i++){
			if (array[i]==1 && array[i+1]==2 && array[i+2]==3){
				result=true;
			}else{}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] newArray={3,2,1,5,3,6};
		if (Task11.boundaryCheck(newArray)==true){
			System.out.println(Task11.sequence(newArray));
		}else{
			System.out.println("It should be only positive numbers in array");
		}

	}

}

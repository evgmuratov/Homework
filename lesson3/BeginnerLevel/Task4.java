package BeginnerLevel;
public class Task4 {
	static int array1[]={4,2,4,3};
	static int array2[]={3,5,2,3,3,3};
	public int quant(int array[], int x){
		int result=0;
		int counter;
		for (counter=0; counter<array.length; counter++){
			if (array[counter]==x){
				result++;
			}else{			
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int result;
		int number=3;
		Task4 myQuantity=new Task4();
		result=myQuantity.quant(array2, number);
		System.out.println("In this array "+number+" repeat "+result+" times");
	}
}

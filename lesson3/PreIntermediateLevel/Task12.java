package PreIntermediateLevel;
public class Task12 {
	public static int[] convertArray(String number){
		String[] items = number.split("");
		int[] digit=new int[items.length];
		for (int i=0; i<items.length; i++){
			digit[i]=Integer.parseInt(items[i]);
			}
		return digit;
	}
	public static  int sumDigits(int[] array){
		int sum=0;
		for (int i=0; i<array.length; i++){
			sum=sum+array[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		String number="1234567";
		int[] myArray;
		myArray=Task12.convertArray(number);
		System.out.println(Task12.sumDigits(myArray));
	}

}

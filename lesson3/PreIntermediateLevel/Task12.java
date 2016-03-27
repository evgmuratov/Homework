package PreIntermediateLevel;
public class Task12 {
	public int[] convertArray(String number){
		number="1234567";
		String[] items = number.split("");
		int[] digit=new int[items.length];
		int i;
		for (i=0; i<items.length; i++){
			digit[i]=Integer.parseInt(items[i]);
			}
		return digit;
	}
	public int sumDigits(int[] array){
		int sum=0;
		int i;
		for (i=0; i<array.length; i++){
			sum=sum+array[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Task12 myNumber=new Task12();
		String number="1234567";
		int amount;
		int[] myArray;
		myArray=myNumber.convertArray(number);
		amount=myNumber.sumDigits(myArray);
		System.out.println(amount);
	}

}

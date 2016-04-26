package IntermediateLevel;

public class SumOfNumbersInTheString {
	public static String[] getStringArray(String line){
		String[] items = line.split("");
		return items;
	}
	public static int[] getDigitsArray(String[] stringArray){
		int[] digitsArray=new int[stringArray.length];
		for (int i=0; i<stringArray.length; i++){
			for (int k=0; k<10; k++){
			if (stringArray[i].equals(Integer.toString(k))){
				digitsArray[i]=Integer.parseInt(stringArray[i]);
				}
			}
			}
		return digitsArray;
	}
	public static int getSum(int[] array){
		int sum=0;
		for (int i=0; i<array.length; i++){
			sum=sum+array[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		String inputString="krm236abw";
		System.out.println("Sum of numbers is "+SumOfNumbersInTheString.getSum(SumOfNumbersInTheString.getDigitsArray(SumOfNumbersInTheString.getStringArray(inputString))));
	}

}

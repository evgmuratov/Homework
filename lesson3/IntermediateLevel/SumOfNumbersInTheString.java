package IntermediateLevel;

public class SumOfNumbersInTheString {
	public String[] getStringArray(String line){
		String[] items = line.split("");
		return items;
	}
	public int[] getDigitsArray(String[] stringArray){
		int i;
		int[] digitsArray=new int[stringArray.length];
		for (i=0; i<stringArray.length; i++){
			int k;
			for (k=0; k<10; k++){
			if (stringArray[i].equals(Integer.toString(k))){
				digitsArray[i]=Integer.parseInt(stringArray[i]);
				}else{}
			}
			}
		return digitsArray;
	}
	public int getSum(int[] array){
		int sum=0;
		int i;
		for (i=0; i<array.length; i++){
			sum=sum+array[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfNumbersInTheString myString=new SumOfNumbersInTheString();
		String inputString="krm236abw";
		int result;
		result=myString.getSum(myString.getDigitsArray(myString.getStringArray(inputString)));
		System.out.println("Sum of numbers is "+result);
	}

}

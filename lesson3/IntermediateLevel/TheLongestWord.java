package IntermediateLevel;

public class TheLongestWord {
	public static String[] convertToArray(String line){
		String[] stringArray=line.split(" ");
		return stringArray;
	}
	public static String maxLengthString(String[] inputArray){
		int length=inputArray[0].length();
		String maxWord="";
		for (int i=1; i<inputArray.length; i++){
			if (inputArray[i].length()>length){
				length=inputArray[i].length();
			}else{}
		}
		for (int i=1; i<inputArray.length; i++){
			if (inputArray[i].length()==length){
				maxWord=inputArray[i];
			}
		}
		return maxWord;
	}
	public static void main(String[] args) {
		//TheLongestWord myString=new TheLongestWord();
		String inputString="the longest word";
		String[] array=TheLongestWord.convertToArray(inputString);		
		System.out.println(TheLongestWord.maxLengthString(array));
	}

}

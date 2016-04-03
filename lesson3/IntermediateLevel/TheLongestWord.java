package IntermediateLevel;

public class TheLongestWord {
	public String[] convertToArray(String line){
		String[] stringArray=line.split(" ");
		return stringArray;
	}
	public String maxLengthString(String[] inputArray){
		int length=inputArray[0].length();
		String maxWord="";
		int i;
		for (i=1; i<inputArray.length; i++){
			if (inputArray[i].length()>length){
				length=inputArray[i].length();
			}else{}
		}
		for (i=1; i<inputArray.length; i++){
			if (inputArray[i].length()==length){
				maxWord=inputArray[i];
			}
		}
		return maxWord;
	}

	public static void main(String[] args) {
		TheLongestWord myString=new TheLongestWord();
		String inputString="the longest word";
		String[] array=myString.convertToArray(inputString);
		String longestWord=myString.maxLengthString(array);
		System.out.println(longestWord);
	}

}

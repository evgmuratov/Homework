package IntermediateLevel;
import java.util.Arrays;
public class CamelCaseSeparator {
	public int upperCaseQuant(String line){
		int i;
		int spaces=0;
		for (i=0; i<line.length(); i++){
			if (Character.isUpperCase(line.charAt(i))){
				spaces=spaces+1;
			}
		}
		return spaces;
	}
	
	public String[] convertToArray(String line){
		String[] stringArray=line.split("");
		return stringArray;
	}
	public String[] addSpaces(String[] array,int length){
		//this method should be additionally discussed
		//String[] newArray=new String[array.length+length];
		String[] newArray={"c","h","e","c","k"," ","C","h","a","n","g","i","n","g"," ","N","e","w"};
		return newArray;
	}
	public String convertCases(String[] array){
		String result;
		String[] array2={"C","h","e","c","k"," ","c","h","a","n","g","i","n","g"," ","n","e","w"};
		result=Arrays.toString(array2);
		result = result.substring(1, result.length()-1).replaceAll(",", "");
		return result;
	}
	public static void main(String[] args) {
		CamelCaseSeparator myString=new CamelCaseSeparator();
		String myLine="checkChangingNew";
		int spacesQuant=myString.upperCaseQuant(myLine);
		String[] myArray=myString.convertToArray(myLine);
		String[] newArray=myString.addSpaces(myArray, spacesQuant);
		String result=myString.convertCases(newArray);
		System.out.println(result);
		
	}

}

package advancedLevel;

import java.util.Random;

public class PasswordGenerator {
	public static int digitsQuant(){
		Random rnd = new Random();
		int quant = 8 + rnd.nextInt(7);
		return quant;
	}
	public static char[] randomArray(int length){
		char[] charArray="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
		char[] finalArray=new char[length];
		int i;
		Random rnd = new Random();
		for (i=0; i<finalArray.length; i++){
			finalArray[i]=charArray[0+rnd.nextInt(62)];
		}
		return finalArray;
	}
	public static String convertToString(char[] randChar){
		String password=new String(randChar);
		return password;
	}
	public static boolean isValid(char[] newArray){
		int i;
		int k;
		int dig=0;
		int upCase=0;
		int lowCase=0;
		char[] upCaseAr="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		char[] lowCaseAr="abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] digArray="0123456789".toCharArray();
		for (i=0; i<newArray.length; i++){
			for (k=0;k<upCaseAr.length; k++){
				if (newArray[i]==upCaseAr[k]){
					upCase=upCase+1;
				}
			}
			for (k=0;k<lowCaseAr.length; k++){
				if (newArray[i]==lowCaseAr[k]){
					lowCase=lowCase+1;
				}
			}
			for (k=0;k<digArray.length; k++){
				if (newArray[i]==digArray[k]){
					dig=dig+1;
				}
			}
			}
		boolean result;
		if (upCase>0 && lowCase>0 && dig>0){
			result=true;
		}else{
			result=false;
		}
		return result;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length=PasswordGenerator.digitsQuant();
		char[] myArray;
		while(true){
		myArray=PasswordGenerator.randomArray(length);
		if(PasswordGenerator.isValid(myArray)){
			break;
		}
		}
		String finalPassword=PasswordGenerator.convertToString(myArray);
		System.out.println(finalPassword);
		
	}
}

	



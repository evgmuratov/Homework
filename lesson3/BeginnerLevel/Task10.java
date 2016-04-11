package BeginnerLevel;

import java.util.Arrays;

public class Task10 {
	public static void printStars(int x){
		char[] charArray=new char[x];
		Arrays.fill(charArray, '*');
		String fullLine=new String(charArray);
		for (int i=1; i<=x; i++){
			System.out.println(fullLine.substring(0,i));
		}
		for (int i=x-1; i>=1; i--){
			System.out.println(fullLine.substring(0,i));
		}
	}

	public static void main(String[] args) {
		Task10.printStars(9);
	}
}

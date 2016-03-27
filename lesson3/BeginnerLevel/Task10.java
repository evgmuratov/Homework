package BeginnerLevel;

import java.util.Arrays;

public class Task10 {
	public void printStars(int x){
		int i;
		char[] charArray=new char[x];
		Arrays.fill(charArray, '*');
		String fullLine=new String(charArray);
		for (i=1; i<=x; i++){
			String partLine;
			partLine=fullLine.substring(0,i);
			System.out.println(partLine);
		}
		for (i=x-1; i>=1; i--){
			String partLine;
			partLine=fullLine.substring(0,i);
			System.out.println(partLine);
		}
	}

	public static void main(String[] args) {
		Task10 myStars=new Task10();
		myStars.printStars(9);
	}
}

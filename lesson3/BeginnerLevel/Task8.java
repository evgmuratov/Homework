package BeginnerLevel;
public class Task8 {
	public static void printLine(String line, int length){
		for (int i=0; i<length; i++){
			int newLength=length-i;
			System.out.print(line.substring(0,newLength));
		}
	}
	public static void main(String[] args) {
		Task8.printLine("Testing", 2);
	}

}

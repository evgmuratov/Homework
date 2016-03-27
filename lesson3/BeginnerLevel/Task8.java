package BeginnerLevel;
public class Task8 {
	public void printLine(String line, int length){
		int i;
		String text;
		for (i=0; i<length; i++){
			int newLength=length-i;
			text=line.substring(0,newLength);
			System.out.print(text);
		}
	}
	public static void main(String[] args) {
		Task8 myLine=new Task8();
		myLine.printLine("Testing", 2);
	}

}

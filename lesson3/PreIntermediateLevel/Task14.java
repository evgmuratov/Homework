package PreIntermediateLevel;
public class Task14 {
	public void printText(String text){
		int i;
		String k="";
		for (i=0; i<text.length(); i++){
			k=k+" ";
			System.out.println(k+text.substring(i,i+1));
		}
	}
	public static void main(String[] args) {
		Task14 myText=new Task14();
		myText.printText("I have finished!");
	}

}

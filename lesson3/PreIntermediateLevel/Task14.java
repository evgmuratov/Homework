package PreIntermediateLevel;
public class Task14 {
	public static void printText(String text){
		String k="";
		for (int i=0; i<text.length(); i++){
			k=k+" ";
			System.out.println(k+text.substring(i,i+1));
		}
	}
	public static void main(String[] args) {
		Task14.printText("I have finished!");
	}

}

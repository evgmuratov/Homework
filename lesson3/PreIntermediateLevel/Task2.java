package PreIntermediateLevel;
public class Task2 {
	public static String swapChar(String line){
		String result;
		char[] array=line.toCharArray();
		int length=array.length;
		char a;
		char b;
		a=array[0];
		b=array[length-1];
		array[0]=b;
		array[length-1]=a;
		result=new String(array);
		return result;
	}
	public static void main(String[] args) {
		System.out.println(Task2.swapChar("who is your daddy?"));			
	}

}

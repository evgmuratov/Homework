package PreIntermediateLevel;
public class Task1 {
	public boolean visitCinema(boolean heSmile, boolean sheSmile){
		boolean go=false;
		if (heSmile==true & sheSmile==true | heSmile==false & sheSmile==false){
			go=true;
		}else{}
		return go;
	}

	public static void main(String[] args) {
		Task1 myCheck=new Task1();
		boolean result;
		result=myCheck.visitCinema(true, true);
		System.out.println(result);
	}

}

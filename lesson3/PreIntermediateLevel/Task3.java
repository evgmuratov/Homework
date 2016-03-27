package PreIntermediateLevel;
public class Task3 {
	public boolean giveRes(int a, int b){
		boolean result;
		if (a==21 | b==21 | a+b==21){
			result=true;
		}else{
			result=false;
		}
		return result;
	}
	public static void main(String[] args) {
		Task3 myCheck=new Task3();
		boolean res;
		res=myCheck.giveRes(18, 3);
		System.out.println(res);		
	}

}

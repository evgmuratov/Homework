package PreIntermediateLevel;
public class Task9 {
	public void multyTable(int x){
		int i;
		for (i=1; i<=9; i++){
			int y=x*i;
			System.out.println(x+"x"+i+"="+y);
		}
	}
	public static void main(String[] args) {
		Task9 myNumber=new Task9();
		myNumber.multyTable(9);

	}

}

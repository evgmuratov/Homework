package BeginnerLevel;
public class Task9 {
	public float division(int a, int b){
		float result;
		result=(float)a/b;
		return result;
	}

	public static void main(String[] args) {
		Task9 myDiv=new Task9();
		float result;
		result=myDiv.division(11,10);
		System.out.println(result);
	}

}

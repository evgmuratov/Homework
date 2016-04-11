package BeginnerLevel;

public class Task3 {
	public static String check(int x){
		String result;
		if (x>=0){
			if (x%3==0 | x%5==0){
				result="true";
			}else{
				result="false";
			}
			
		}else{
			result="Invalid value. Only non-negative number allowed!";
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Task3.check(-15));

	}

}

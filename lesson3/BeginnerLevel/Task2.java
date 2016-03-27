package BeginnerLevel;

public class Task2 {
			public String check(int x, int y){
			String result;
			if (x==10 || y==10 || x+y==10){
				result="true";
			}else{
				result="false";
			}
			return result;
		}

		public static void main(String[] args) {
			Task2 newCheck=new Task2();
			String result;
			result=newCheck.check(5,5);
			System.out.println(result);
		

	}

}

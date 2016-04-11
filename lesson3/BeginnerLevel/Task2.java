package BeginnerLevel;

public class Task2 {
			public static boolean check(int x, int y){
			if (x==10 || y==10 || x+y==10){
				return true;
			}else{
				return false;
			}
			
		}

		public static void main(String[] args) {
			System.out.println(Task2.check(5, 6));
		

	}

}

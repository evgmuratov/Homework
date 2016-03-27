package BeginnerLevel;
public class Task6 {
	public void printEven(){
		int counter;
		for (counter=0; counter<=50; counter++){
			if (!(counter==0) && counter%2==0){
				System.out.println(counter);
			}else{}
		}
	}
	public void printEven2(){
		int counter2=0;
		while (counter2<=50){
			if (!(counter2==0) && counter2%2==0){
				System.out.println(counter2);
			}else{}
			counter2++;
		}
	}
		public static void main(String[] args) {
		Task6 myRange=new Task6();
		myRange.printEven2();
	}
}

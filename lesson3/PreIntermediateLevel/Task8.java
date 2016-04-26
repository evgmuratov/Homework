package PreIntermediateLevel;
public class Task8 {
	//It seems that result is not correct. It should be discussed.
	public static long fibonachi(){
		long a=0;
		long b=1;
		long c;
		long result=1;
		int i=0;
		while (true){
			c=a+b;
			a=b;
			b=c;
			if (c%2!=0){
				result=result+c;
				i++;
			}
			if (i==100){
				break;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(Task8.fibonachi());
	}

}

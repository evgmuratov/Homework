package PreIntermediateLevel;
public class Task8 {
	//It seems that result is not correct. It should be discussed.
	public long fibonachi(){
		int i;
		long a=0;
		long b=1;
		long c;
		long result=1;
		for (i=3; i<=300; i++){
			c=a+b;
			a=b;
			b=c;
			if (!(c%2==0)){
				result=result+c;
			}else{}
		}
		return result;
	}
	public static void main(String[] args) {
		Task8 mySum=new Task8();
		long res;
		res=mySum.fibonachi();
		System.out.println(res);
	}

}

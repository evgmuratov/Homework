package PreIntermediateLevel;
public class Task13 {
	public void equation(int a, int b, int c){
		int d;
		double x1;
		double x2;
		int x;
		d=(int)Math.pow(b, 2)-a*c;
		if (d>0){
			x1=(-b+Math.sqrt(d))/2*a;
			x2=(-b-Math.sqrt(d))/2*a;
			System.out.println("x1 equal "+x1);
			System.out.println("x2 equal "+x2);
		}else if(d==0){
			x=-b/2*a;
			System.out.println("There is only one result. x equal "+x);
		}else{
			System.out.println("There is no results for this equation");
		}
	}

	public static void main(String[] args) {
		Task13 myEquation=new Task13();
		myEquation.equation(5, 3, 4);
	}

}

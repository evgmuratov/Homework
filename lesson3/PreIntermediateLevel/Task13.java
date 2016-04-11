package PreIntermediateLevel;
public class Task13 {
	public static void equation(int a, int b, int c){
		int d;
		d=(int)Math.pow(b, 2)-a*c;
		if (d>0){
			System.out.println("x1 equal "+(-b+Math.sqrt(d))/2*a);
			System.out.println("x2 equal "+(-b-Math.sqrt(d))/2*a);
		}else if(d==0){
			System.out.println("There is only one result. x equal "+-b/2*a);
		}else{
			System.out.println("There is no results for this equation");
		}
	}
	public static void main(String[] args) {
		Task13.equation(5, 3, 4);
	}
}

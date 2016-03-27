package BeginnerLevel;

public class Task1 {
	public void multiply (int x, int y, int z){
		x=x*3;
		y=y*3;
		z=z*3;
		System.out.println("x is "+x);
		System.out.println("y is "+y);
		System.out.println("z is "+z);
	}

	public static void main(String[] args) {
		Task1 newArray=new Task1();
		newArray.multiply(10, 11, 12);

	}

}

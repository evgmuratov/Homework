package IntermediateLevel;

public class LuckyTickets {
	public static int[] convertToArray(int x){
		String number = Integer.toString(x);
		String[] items = number.split("");
		int[] array=new int[6];
		for (int i=0; i<6; i++){
			array[i]=0;
		}
		for (int i=0; i<(items.length); i++){
			array[5-i]=Integer.parseInt(items[(items.length-i-1)]);
			}
		return array;
	}
	public static boolean isLucky(int[] array){
		int x=0;
		int y=0;
		for (int i=0; i<3; i++){
			x=x+array[i];
		}
		for (int i=3; i<6; i++){
			y=y+array[i];
		}
		return x==y;
	}

	public static void main(String[] args) {
		int startRange=1;
		int endRange=1100;
		int[] myArray;
		boolean lucky;
		int quantity=0;
		for (int i=startRange; i<=endRange; i++){
			myArray=LuckyTickets.convertToArray(i);
			lucky=LuckyTickets.isLucky(myArray);
			if (lucky==true){
				quantity=quantity+1;
			}
		}
		System.out.println("There are "+quantity+" lucky tickets in this range");
	}

}

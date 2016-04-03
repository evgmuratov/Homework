package IntermediateLevel;

public class LuckyTickets {
	public int[] convertToArray(int x){
		String number = Integer.toString(x);
		String[] items = number.split("");
		int[] array=new int[6];
		int i;
		for (i=0; i<6; i++){
			array[i]=0;
		}
		for (i=0; i<(items.length); i++){
			array[5-i]=Integer.parseInt(items[(items.length-i-1)]);
			}
		return array;
	}
	public boolean isLucky(int[] array){
		boolean lucky=false;
		int x=0;
		int y=0;
		int i;
		for (i=0; i<3; i++){
			x=x+array[i];
		}
		for (i=3; i<6; i++){
			y=y+array[i];
		}
		if (x==y){
			lucky=true;
			}else{}
		return lucky;
	}

	public static void main(String[] args) {
		LuckyTickets myTickets=new LuckyTickets();
		int startRange=1;
		int endRange=1100;
		int i;
		int[] myArray;
		boolean lucky;
		int quantity=0;
		for (i=startRange; i<=endRange; i++){
			myArray=myTickets.convertToArray(i);
			lucky=myTickets.isLucky(myArray);
			if (lucky==true){
				quantity=quantity+1;
			}else{}
		}
		System.out.println("There are "+quantity+" lucky tickets in this range");
	}

}

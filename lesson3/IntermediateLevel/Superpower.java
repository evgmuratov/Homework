package IntermediateLevel;
import java.util.Scanner;
public class Superpower {
	public int[] convertArray(int inputNumber){
		String number = Integer.toString(inputNumber);
		String[] items = number.split("");
		int[] digit=new int[items.length];
		int i;
		for (i=0; i<items.length; i++){
			digit[i]=Integer.parseInt(items[i]);
			}
		return digit;
		}
	public int sumDigits(int[] array){
		int sum=0;
		int i;
		for (i=0; i<array.length; i++){
			sum=sum+array[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.print("Enter an integer positive number: ");
	    Scanner myScanner = new Scanner(System.in);
		int number = myScanner.nextInt();
		if (number<=0){
			System.out.println("Superpower works only with positive numbers. Please, input right number");
			}else{
	    Superpower myNumber=new Superpower();
		int amount;
		int[] myArray;
		myArray=myNumber.convertArray(number);
		amount=myNumber.sumDigits(myArray);
		System.out.println(amount);
	}
	}
}

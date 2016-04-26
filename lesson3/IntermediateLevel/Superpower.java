package IntermediateLevel;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Superpower {
	public static int[] convertArray(int inputNumber){
		String number = Integer.toString(inputNumber);
		String[] items = number.split("");
		int[] digit=new int[items.length];
		for (int i=0; i<items.length; i++){
			digit[i]=Integer.parseInt(items[i]);
			}
		return digit;
		}
	public static int sumDigits(int[] array){
		int sum=0;
		for (int i=0; i<array.length; i++){
			sum=sum+array[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.print("Enter an integer positive number: ");
	    Scanner myScanner = new Scanner(System.in);
	    int number=0;
	   try{
			number = myScanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Only number could be input");
			System.out.print("Enter an integer positive number: ");
			myScanner = new Scanner(System.in);
			number = myScanner.nextInt();			
		}
	    myScanner.close();
		if (number<=0){
			System.out.println("Superpower works only with positive numbers. Please, input right number");
			}else{	    
		int[] myArray;
		myArray=Superpower.convertArray(number);
		System.out.println(Superpower.sumDigits(myArray));
	}
	}
}

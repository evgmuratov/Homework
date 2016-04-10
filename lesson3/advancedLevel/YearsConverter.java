package advancedLevel;

import java.util.Arrays;

public class YearsConverter {
	public static int y;
	public static String thousands(int year){
		int x=year/1000;
		String thousands;
		char[] mArray;
		if (x>=1){
			mArray=new char[x];
			Arrays.fill(mArray, 'M');
			y=year-x*1000;
			//System.out.println("x>=1(thousands)"+y);
		}else{
			y=year;
			mArray=new char[x];
			//System.out.println("else(thousands)"+y);
		}
		thousands=new String(mArray);
		return thousands;
	}
	public static String hundreds(int year){
		int x=year/100;
		String hundreds;
		char[] hArray;
		if (x==9){
			hArray=new char[2];
			hArray[0]='C';
			hArray[1]='M';
			y=year-x*100;
			//System.out.println("x==9(hundreds)"+y);
		}else if (x==8){
			hArray=new char[4];			
			hArray[0]='D';
			hArray[1]='C';
			hArray[2]='C';
			hArray[3]='C';
			y=year-x*100;
			//System.out.println("x==8(hundreds)"+y);
		}else if (x==7){
			hArray=new char[3];			
			hArray[0]='D';
			hArray[1]='C';
			hArray[2]='C';			
			y=year-x*100;
			//System.out.println("x==7(hundreds)"+y);
		}else if (x==6){
			hArray=new char[2];			
			hArray[0]='D';
			hArray[1]='C';					
			y=year-x*100;
			//System.out.println("x==6(hundreds)"+y);
		}else if (x==5){
			hArray=new char[1];			
			hArray[0]='D';								
			y=year-x*100;
			//System.out.println("x==5(hundreds)"+y);
		}else if (x==4){
			hArray=new char[2];			
			hArray[0]='C';
			hArray[1]='D';					
			y=year-x*100;
			//System.out.println("x==4(hundreds)"+y);
		}else if (x>=1 && x<4){
			hArray=new char[x];
			Arrays.fill(hArray, 'C');
			y=year-x*100;
			//System.out.println("x>=1 && x<4(hundreds)"+y);
		}else{
			y=year;
			hArray=new char[x];
			//System.out.println("else(hundreds)"+y);
		}
		hundreds=new String(hArray);
		return hundreds;
	}
	public static String dozens(int year){
		int x=year/10;
		String dozens;
		char[] dArray;
		if (x==9){
			dArray=new char[2];
			dArray[0]='X';
			dArray[1]='C';
			y=year-x*10;
			//System.out.println("x==9(dozens)"+y);
		}else if(x==8){
			dArray=new char[4];
			dArray[0]='L';
			dArray[1]='X';
			dArray[2]='X';
			dArray[3]='X';
			y=year-x*10;
			//System.out.println("x==8(dozens)"+y);
		}else if(x==7){
			dArray=new char[3];
			dArray[0]='L';
			dArray[1]='X';
			dArray[2]='X';
			y=year-x*10;
			//System.out.println("x==7(dozens)"+y);
		}else if(x==6){
			dArray=new char[2];
			dArray[0]='L';
			dArray[1]='X';			
			y=year-x*10;
			//System.out.println("x==6(dozens)"+y);
		}else if (x==5){
			dArray=new char[1];
			dArray[0]='L';
			y=year-x*10;
			//System.out.println("x==5(dozens)"+y);		
		}else if(x==4){
			dArray=new char[2];
			dArray[0]='X';
			dArray[1]='L';
			y=year-x*10;
			//System.out.println("x==4(dozens)"+y);
		}else if (x>=1 && x<4){
			dArray=new char[x];
			Arrays.fill(dArray, 'X');
			y=year-x*100;
			//System.out.println("x>=1 && x<4(dozens)"+y);
		}
		else{
			y=year;
			dArray=new char[x];
			//System.out.println("else(dozens)"+y);
		}
		dozens=new String(dArray);
		return dozens;
	}
	public static String units(int year){
		int x=year;
		String units;
		char[] uArray;
		if (x==9){
			uArray=new char[2];
			uArray[0]='I';
			uArray[1]='X';			
		}else if (x==8){
			uArray=new char[4];
			uArray[0]='V';
			uArray[1]='I';
			uArray[2]='I';
			uArray[3]='I';
		}else if(x==7){
			uArray=new char[3];
			uArray[0]='V';
			uArray[1]='I';
			uArray[2]='I';
		}else if(x==6){
			uArray=new char[2];
			uArray[0]='V';
			uArray[1]='I';
		}else if(x==5){
			uArray=new char[1];
			uArray[0]='V';
		}else if(x==4){
			uArray=new char[2];
			uArray[0]='I';
			uArray[1]='V';	
		}else if (x>=1 && x<4){
			uArray=new char[x];
			Arrays.fill(uArray, 'I');			
		}
		else{
			uArray=new char[x];			
		}
		units=new String(uArray);
		return units;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arYear=1453;
		String result=YearsConverter.thousands(arYear);
		String finalResult=result.concat(YearsConverter.hundreds(y)).concat(YearsConverter.dozens(y)).concat(YearsConverter.units(y));
		System.out.println(finalResult);

	}

}

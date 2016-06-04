package myApplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Employees {
	public static int Salary(int basic, int grade, int bonus){
		int res=basic*grade+(basic*grade*bonus)/100;
		return res;
	}
	public static int Pension(int salary, String program, int experience){
		int res=0;
		if(program.equals("high")){
			res=salary*40*experience/1000;
		}else if(program.equals("middle")){
			res=salary*25*experience/1000;			
		}else if(program.equals("slow")){
		res=salary*10*experience/1000;			
		}
		return res;
	}
	public static int Vacation(int standard, int usedDays, int experience){
		int res=0;
		int k=0;
		if(experience<=5){
			k=1;
		}else if(experience>5 | experience<=10){
			k=2;
		}else if(experience>10){
			k=3;
		}
		res=standard*k-usedDays;
		return res;
	}
	public static long workHourValue(int salary, long workDays){
		long res=salary/(workDays*8);
		return res;
	}
	public static long totalWorkDays(String startDay, String currentDay){
		SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
		long res = 0;
		try {
			Date startDate = myFormat.parse(startDay);
			Date currentDate = myFormat.parse(currentDay);
			long diff = currentDate.getTime()-startDate.getTime();
			res = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
			} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;		
	}
	public static int tax(int salary){
		int k = 0;
		if(salary<=10000){
			k=10;
		}else if(salary>10000 | salary<=25000){
			k=15;
		}else if(salary>25000 | salary<=40000){
			k=27;
		}else if (salary>40000){
			k=40;
		}
		int res = salary*k/100;
		return res;
	}
	public static Date retireDate(String birthDay, String startWork){
		SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
		Date res = null;
		Date birthDate = null;
		Date startWorkDate = null;
		try {
			birthDate = myFormat.parse(birthDay);
			startWorkDate = myFormat.parse(startWork);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Calendar calend = Calendar.getInstance();
		calend.setTime(birthDate);
		calend.add(Calendar.YEAR, 65);
		Date possDate1 = calend.getTime();
		calend.setTime(startWorkDate);
		calend.add(Calendar.YEAR, 40);
		Date possDate2 = calend.getTime();
		int comparison = possDate1.compareTo(possDate2);
		int comparison2 = possDate2.compareTo(possDate1);
		if(comparison==-1){
			res=possDate2;
		}else if(comparison2==-1){
			res=possDate1;
		}else if(comparison==0 & comparison2==0){
			res=possDate1;
		}
		return res;		
	}
	public static void main(String[] args) {
		System.out.println("Vitaliy has "+Employees.Salary(5000, 5, 200)+" UAH in may 2016");
		System.out.println(Employees.tax(Employees.Salary(5000, 5, 200))+" UAH of taxes will be payed.");
		System.out.println(Employees.Pension(Employees.Salary(5000, 5, 200), "high", 4)+" UAH will be send to pension fund.");
		System.out.println("In this month he has "+Employees.totalWorkDays("01 05 2016", "01 06 2016")+" work days");
		System.out.println("The value of one work hour in may is "+Employees.workHourValue(Employees.Salary(5000, 5, 200), Employees.totalWorkDays("05 01 2016", "06 01 2016"))+" UAH");
		System.out.println("He has "+Employees.Vacation(28, 12, 4)+" days left for vacation in this year");
		System.out.println("He could go on retire "+Employees.retireDate("28 05 1989", "29 01 2012")+" if he wants.");
	}
}

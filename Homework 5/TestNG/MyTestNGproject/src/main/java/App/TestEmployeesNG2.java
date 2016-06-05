package App;
import org.testng.annotations.*;
public class TestEmployeesNG2 {
	@BeforeGroups
	public static void startSuite(){
		System.out.println("New group in 2st suite is started");
		}
	@AfterGroups
	public static void finishSuite(){
		System.out.println("New group in 2st suite is finished");
		}
	@BeforeTest
	public void start(){
		System.out.println("Test is started");
		}
	@AfterTest
	public void finish(){
	System.out.println("Test is finished");
	}
	@Test(groups = {"Group3"})
	public void testTotalWorkDays(){
		assert EmployeesNG.totalWorkDays("01 05 2016", "01 06 2016") == 31 : "Expected total work days are 31 for " + EmployeesNG.totalWorkDays("01 05 2016", "01 06 2016");
	}
	@Test(expectedExceptions=java.text.ParseException.class, groups = {"Group5"})
	public void testTotalWorkDaysNegative(){
		EmployeesNG.totalWorkDays("abc", "01 06 2016");
	}
	@Test(groups = {"Group4"})
	public void testTax(){
		assert EmployeesNG.tax(75000) == 11250 : "Expected tax is 11250 for " + EmployeesNG.tax(75000);
	}
	@Test(groups = {"Group4"})
	public void testVacation(){
		assert EmployeesNG.Vacation(28, 12, 4) == 16 : "Expected vacation days are 16 for " + EmployeesNG.Vacation(28, 12, 4);
	}
		}
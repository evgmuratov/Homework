package App;
import org.testng.annotations.*;
public class TestEmployeesNG1 {
	EmployeesNG EmployeesNG = new EmployeesNG();
	@BeforeGroups
	public static void startSuite(){
		System.out.println("New group in 1st suite is started");
		}
	@AfterGroups
	public static void finishSuite(){
		System.out.println("New group in 1st suite is finished");
		}
	@BeforeTest
	public void start(){
		System.out.println("Test is started");
		}
	@AfterTest
	public void finish(){
	System.out.println("Test is finished");
	}
	@Test(groups = {"Group1"})
	public void testSalary(){
		assert EmployeesNG.Salary(5000, 5, 200) == 75000 : "Expected salary is 75000 for " + EmployeesNG.Salary(5000, 5, 200);
	}
	@Test(groups = {"Group2"})
	public void testPension(){
		assert EmployeesNG.Pension(75000, "high", 4) == 12000 : "Expected pension is 12000 for " + EmployeesNG.Pension(75000, "high", 4);
		}
	@Test(timeOut=1000, dependsOnGroups = { "Group2" })
	public void testWorkHourValue(){
		assert EmployeesNG.workHourValue(75000, 31) == 302 : "Expected work our value is 302 for " + EmployeesNG.workHourValue(75000, 31);
		}
	@Test (enabled = false, groups = {"Group1"})
	public void testRetireDate(){
		assert EmployeesNG.retireDate("28 05 1989", "29 01 2012").equals("Thu May 28 00:00:00 EEST 2054") : "Expected retire date is Thu May 28 00:00:00 EEST 2054 for " + EmployeesNG.retireDate("28 05 1989", "29 01 2012");
		}
		}
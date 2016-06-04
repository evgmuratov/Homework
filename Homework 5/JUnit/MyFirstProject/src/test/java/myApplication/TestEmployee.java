package myApplication;
import static org.junit.Assert.*;
import org.junit.*;
public class TestEmployee {
	@BeforeClass
	public static void startSuite(){
		System.out.println("Test suite is started");
		}
	@AfterClass
	public static void finishSuite(){
		System.out.println("Test suite is finished");
		}
	@Before
	public void start(){
		System.out.println("Test is started");
		}
	@After
	public void finish(){
	System.out.println("Test is finished");
	}
	@Test
	public void testSalary(){
		assertEquals("failure - salary is counted wrong", 75000, Employees.Salary(5000, 5, 200));
	}
	@Test
	public void testPension(){
		assertEquals("failure - pension transfer is counted wrong", 12000, Employees.Pension(75000, "high", 4));
	}
	@Test
	public void testWorkHourValue(){
		assertEquals("failure - work our value is counted wrong", 9375, Employees.workHourValue(75000, 31));
	}
	@Test
	public void testTotalWorkDays(){
		assertEquals("failure - total work days is counted wrong", 31, Employees.totalWorkDays("01 05 2016", "01 06 2016"));
	}
	@Test
	public void testTax(){
		assertEquals("failure - tax is counted wrong", 11250, Employees.tax(75000));
	}
	@Test
	public void testVacation(){
		assertEquals("failure - vacation days is counted wrong", 16, Employees.Vacation(28, 12, 4));
	}
	@Test
	@Ignore("Need more time to finish this test")
	public void testRetireDate(){
		assertEquals("failure - retire date is counted wrong", "Thu May 28 00:00:00 EEST 2054", Employees.retireDate("28 05 1989", "29 01 2012"));
	}
		}
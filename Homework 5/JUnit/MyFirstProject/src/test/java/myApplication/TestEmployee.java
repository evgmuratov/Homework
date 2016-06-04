package myApplication;
import static org.junit.Assert.*;
import org.junit.*;
public class TestEmployee {
	@BeforeClass
	public static void startSuite(){
		System.out.println("TestEmployee is started");
		}
	@AfterClass
	public static void finishSuite(){
		System.out.println("TestEmployee is finished");
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
		assertEquals("failure - work our value is counted wrong", 302, Employees.workHourValue(75000, 31));
	}
	@Test
	@Ignore("Need more time to finish this test")
	public void testRetireDate(){
		assertEquals("failure - retire date is counted wrong", "Thu May 28 00:00:00 EEST 2054", Employees.retireDate("28 05 1989", "29 01 2012"));
	}
		}
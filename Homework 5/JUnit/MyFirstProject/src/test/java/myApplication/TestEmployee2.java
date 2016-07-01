package myApplication;
import static org.junit.Assert.*;
import org.junit.*;
public class TestEmployee2 {
	Employees Employees = new Employees();
	@BeforeClass
	public static void startSuite(){
		System.out.println("TestEmployee2 is started");
		}
	@AfterClass
	public static void finishSuite(){
		System.out.println("TestEmployee2 is finished");
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
	public void testTotalWorkDays(){
		assertEquals("failure - total work days is counted wrong", 31, Employees.totalWorkDays("01 05 2016", "01 06 2016"));
	}
	@Test(expected=java.text.ParseException.class)
	public void testTotalWorkDaysNegative(){
		Employees.totalWorkDays("abc", "01 06 2016");
	}
			}
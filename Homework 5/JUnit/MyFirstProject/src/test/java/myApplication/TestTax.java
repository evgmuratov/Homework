package myApplication;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(value = Parameterized.class)
public class TestTax {
	Employees Employees = new Employees();
	@BeforeClass
	public static void startSuite(){
		System.out.println("TestTax is started");
		}
	@AfterClass
	public static void finishSuite(){
		System.out.println("TestTax is finished");
		}
	
    @Parameter(value = 0)
    public int salary;

    @Parameter(value = 1)
    public int expected;
    
    @Parameters(name = "{index}: testTax(salary-{0} = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {9900, 990},
                {19900, 2985},
                {30000, 8100},
                {49900, 19960},
        });
    }
    @Test
    public void test() {
        assertThat(Employees.tax(salary), is(expected));
    }

}

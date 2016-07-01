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
public class TestPension {
	Employees Employees = new Employees();
	@BeforeClass
	public static void startSuite(){
		System.out.println("TestPension is started");
		}
	@AfterClass
	public static void finishSuite(){
		System.out.println("TestPension is finished");
		}
	
    @Parameter(value = 0)
    public int salary;

    @Parameter(value = 1)
    public String program;

    @Parameter(value = 2)
    public int experience;

    @Parameter(value = 3)
    public int expected;
    
    @Parameters(name = "{index}: testPension(salary-{0}, program-{1}, experience-{2}) = {3}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {10000, "high", 2, 800},
                {15000, "middle", 5, 1875},
                {8000, "slow", 1, 80}
        });
    }

    @Test
    public void test() {
        assertThat(Employees.Pension(salary, program, experience), is(expected));
    }

}

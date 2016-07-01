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
public class TestVacation {
	Employees Employees = new Employees();
	@BeforeClass
	public static void startSuite(){
		System.out.println("TestVacation is started");
		}
	@AfterClass
	public static void finishSuite(){
		System.out.println("TestVacation is finished");
		}
	
    @Parameter(value = 0)
    public int standard;

    @Parameter(value = 1)
    public int used;

    @Parameter(value = 2)
    public int experience;

    @Parameter(value = 3)
    public int expected;
    
    @Parameters(name = "{index}: testVacation(standard-{0}, used-{1}, experience-{2}) = {3}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {28, 6, 4, 22},
                {28, 4, 7, 52},
                {28, 12, 12, 72}
        });
    }

    @Test
    public void test() {
        assertThat(Employees.Vacation(standard, used, experience), is(expected));
    }

}

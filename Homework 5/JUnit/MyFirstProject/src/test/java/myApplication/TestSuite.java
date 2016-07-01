package myApplication;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
TestEmployee.class,
TestEmployee2.class,
TestPension.class,
TestTax.class,
TestVacation.class
})
public class TestSuite {}

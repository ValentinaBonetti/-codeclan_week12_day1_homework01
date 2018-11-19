package staff.techStaff;

import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setup(){
        developer = new Developer("Yari","SA104035", 30345.0);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(2100.0);
        assertEquals(32445.0,developer.getSalary(),0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(303.45, developer.payBonus(),0.01);
    }

}

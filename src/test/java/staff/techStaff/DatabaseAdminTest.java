package staff.techStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {


    DatabaseAdmin databaseAdmin;

    @Before
    public void setup(){
        databaseAdmin = new DatabaseAdmin("Yari","SA104039", 30345.0);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(2100.0);
        assertEquals(32445.0,databaseAdmin.getSalary(),0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(303.45, databaseAdmin.payBonus(),0.01);
    }

}

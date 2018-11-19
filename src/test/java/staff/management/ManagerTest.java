package staff.management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setup(){
        manager = new Manager("Yuri","SA104030", 50345.0, "Sales");

    }

    @Test
    public void hasDeptName(){
        assertEquals("Sales",manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(2100.0);
        assertEquals(52445.0,manager.getSalary(),0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(503.45, manager.payBonus(),0.01);
    }

}

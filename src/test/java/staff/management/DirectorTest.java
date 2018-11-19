package staff.management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setup(){
        director = new Director("Kevin","SA105060", 98345.0, "Management", 678945.0);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Management",director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(2100.0);
        assertEquals(100445.0,director.getSalary(),0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(983.45, director.payBonus(),0.01);
    }

    @Test
    public void hasBudget(){
        assertEquals(678945.0,director.getBudget(),0.01);
    }
}

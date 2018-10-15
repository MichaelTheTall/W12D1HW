import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Bob", "AB123456C", 20000.00, "HR");
    }

    @Test
    public void getName(){
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void getNI(){
        assertEquals("AB123456C", manager.getNI());
    }

    @Test
    public void getSalary(){
        assertEquals(20000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void getDeptName(){
        assertEquals("HR", manager.getDeptName());
    }

    @Test
    public void raiseSalary(){
        manager.raiseSalary(2000.00);
        assertEquals(22000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void payBonus(){
        assertEquals(200.00, manager.payBonus(), 0.01);
    }

    @Test
    public void setName() {
        manager.setName("Mr. Bob");
        assertEquals("Mr. Bob", manager.getName());
    }

    @Test
    public void nullName(){
        manager.setName(null);
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void negRaise() {
        manager.raiseSalary(-100.00);
        assertEquals(20000.00, manager.getSalary(), 0.01);
    }

}

import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    
    Developer dev;
    
    @Before
    public void before() {
        dev = new Developer("Dan", "XY123456Z", 15000.00);
    }
    
    @Test
    public void getName() {
        assertEquals("Dan", dev.getName());
    }

    @Test
    public void getNI(){
        assertEquals("XY123456Z", dev.getNI());
    }

    @Test
    public void getSalary(){
        assertEquals(15000.00, dev.getSalary(), 0.01);
    }

    @Test
    public void raiseSalary(){
        dev.raiseSalary(1000.00);
        assertEquals(16000.00, dev.getSalary(), 0.01);
    }

    @Test
    public void payBonus(){
        assertEquals(150.00, dev.payBonus(), 0.01);
    }
    
}

import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director boss;
    
    @Before
    public void before(){
        boss = new Director("Mr. Boss", "BB888888B", 100000.00, "CEO", 2000000.00);
    }

    @Test
    public void getName(){
        assertEquals("Mr. Boss", boss.getName());
    }

    @Test
    public void getNI(){
        assertEquals("BB888888B", boss.getNI());
    }

    @Test
    public void getSalary(){
        assertEquals(100000.00, boss.getSalary(), 0.01);
    }

    @Test
    public void getDeptName(){
        assertEquals("CEO", boss.getDeptName());
    }

    @Test
    public void raiseSalary(){
        boss.raiseSalary(10000.00);
        assertEquals(110000.00, boss.getSalary(), 0.01);
    }

    @Test
    public void payBonus(){
        assertEquals(2000.00, boss.payBonus(), 0.01);
    }

    @Test
    public void getBudget(){
        assertEquals(2000000.00, boss.getBudget(), 0.01);
    }

}

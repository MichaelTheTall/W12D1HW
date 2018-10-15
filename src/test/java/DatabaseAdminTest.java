import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    
        DatabaseAdmin admin;

        @Before
        public void before() {
            admin = new DatabaseAdmin("Andrew", "XY123456Z", 18000.00);
        }

        @Test
        public void getName() {
            assertEquals("Andrew", admin.getName());
        }

        @Test
        public void getNI(){
            assertEquals("XY123456Z", admin.getNI());
        }

        @Test
        public void getSalary(){
            assertEquals(18000.00, admin.getSalary(), 0.01);
        }

        @Test
        public void raiseSalary(){
            admin.raiseSalary(2000.00);
            assertEquals(20000.00, admin.getSalary(), 0.01);
        }

        @Test
        public void payBonus(){
            assertEquals(180.00, admin.payBonus(), 0.01);
        }




}

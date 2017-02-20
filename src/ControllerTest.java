import org.junit.Test;

import static org.junit.Assert.*;

public class ControllerTest
{
    Controller ctrl;

    @org.junit.Before
    public void setUp() throws Exception
    {
        ctrl = new Controller();
    }

    @org.junit.After
    public void tearDown() throws Exception
    {

    }

    /**
     * Test the given integer from 1-1000 is even.
     */
    @org.junit.Test
    public void isEven() throws Exception
    {
        // First invalid partition
        assertEquals( false, ctrl.isEven( 0 ) );

        // Valid partition
        assertEquals( true, ctrl.isEven( 500 ) );

        // Last invalid partition
        assertEquals( false, ctrl.isEven( 1001 ) );
    }

    /**
     * Test the given amount is valid.
     */
    @org.junit.Test
    public void checkSalary() throws Exception
    {
        // First invalid partition
        assertEquals( false, ctrl.checkSalary( 0 ) );

        // Valid partition
        assertEquals( true, ctrl.checkSalary( 1000 ) );

        // Last invalid partition
        assertEquals( false, ctrl.checkSalary( 75001 ) );
    }

    /**
     * Test the number of days in a specific month and year.
     */
    @org.junit.Test
    public void getNumDaysinMonth() throws Exception
    {
        // First invalid partition
        assertSame( 0, Controller.getNumDaysinMonth( 0,2017 ) );

        // Valid partition
        assertSame( 31, Controller.getNumDaysinMonth( 1,2017 ) );

        // Last invalid partition
        assertSame( 0, Controller.getNumDaysinMonth( 13,2017 ) );
    }

}
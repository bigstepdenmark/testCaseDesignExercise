import org.junit.Test;

import static org.junit.Assert.*;

public class ControllerTest
{
    private Controller ctrl;

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
        /************************************
         * EQUIVALENCE PARTITIONING
         ************************************/
        // First invalid partition
        assertEquals( false, ctrl.isEven( 0 ) );

        // Valid partition
        assertEquals( true, ctrl.isEven( 500 ) );

        // Last invalid partition
        assertEquals( false, ctrl.isEven( 1001 ) );

        /************************************
         * BOUNDARY VALUE ANALYSIS
         ************************************/
        // First invalid partition
        assertEquals( false, ctrl.isEven( 0 ) );

        // Valid partition
        assertEquals( false, ctrl.isEven( 1 ) );
        assertEquals( true, ctrl.isEven( 1000 ) );

        // Last invalid partition
        assertEquals( false, ctrl.isEven( 1001 ) );
    }

    /**
     * Test the given amount is valid.
     */
    @org.junit.Test
    public void checkSalary() throws Exception
    {
        /************************************
         * EQUIVALENCE PARTITIONING
         ************************************/
        // First invalid partition
        assertEquals( false, ctrl.checkSalary( 0 ) );

        // Valid partition
        assertEquals( true, ctrl.checkSalary( 1000 ) );

        // Last invalid partition
        assertEquals( false, ctrl.checkSalary( 75001 ) );

        /************************************
         * BOUNDARY VALUE ANALYSIS
         ************************************/
        // First invalid partition
        assertEquals( false, ctrl.checkSalary( 0 ) );

        // Valid partition
        assertEquals( true, ctrl.checkSalary( 1000 ) );
        assertEquals( true, ctrl.checkSalary( 75000 ) );

        // Last invalid partition
        assertEquals( false, ctrl.checkSalary( 75001 ) );
    }

    /**
     * Test the number of days in a specific month and year.
     */
    @org.junit.Test
    public void getNumDaysinMonth() throws Exception
    {
        /************************************
         * EQUIVALENCE PARTITIONING
         ************************************/
        // First invalid partition
        assertSame( 0, Controller.getNumDaysinMonth( 0, 0 ) );

        // Valid partition
        assertSame( 31, Controller.getNumDaysinMonth( 1, 2017 ) );

        // Last invalid partition
        assertSame( 0, Controller.getNumDaysinMonth( 13, 100000 ) );

        /************************************
         * BOUNDARY VALUE ANALYSIS
         ************************************/
        // First invalid partition
        assertSame( 0, Controller.getNumDaysinMonth( 0, 0 ) );

        // Valid partition
        assertSame( 31, Controller.getNumDaysinMonth( 1, 1975 ) );
        assertSame( 31, Controller.getNumDaysinMonth( 12, 2017 ) );

        // Last invalid partition
        assertSame( 0, Controller.getNumDaysinMonth( 13, 100000 ) );
    }

    /**
     * Test the reimbursed percentage the client get
     */
    @org.junit.Test
    public void getReimbursePercentage() throws Exception
    {
        // First invalid partition
        assertSame( 0, ctrl.getReimbursePercentage( false, true, true ) );

        // Valid partition
        assertSame( 50, ctrl.getReimbursePercentage( true, true, false ) );

        // Last invalid partition
        assertSame( 0, ctrl.getReimbursePercentage( true, true, true ) );
    }

    /**
     * Test the given year is leap year
     */
    @org.junit.Test
    public void isLeapYear() throws Exception
    {
        // First invalid partition
        assertFalse( ctrl.isLeapYear( 0 ) );

        // Valid partition
        assertTrue( ctrl.isLeapYear( 2000 ) );

        // Last invalid partition
        assertFalse( ctrl.isLeapYear( 5555 ) );
    }
}
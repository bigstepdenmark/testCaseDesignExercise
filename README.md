# TEST_CASE_DESIGN – STUDY_POINT_EXERCISES

_Færdig med EQUIVALENCE PARTITIONING_

_Manger BOUNDARY VALUE ANALYSIS og DECISION TABLES_


### Controller.class
```java
import java.time.DateTimeException;
import java.time.YearMonth;

public class Controller
{
    // Ex. EQUIVALENCE PARTITIONING 1..
    public boolean isEven(int number)
    {
        return number > 0 && number <= 1000 && number % 2 == 0;
    }

    // Ex. EQUIVALENCE PARTITIONING 2.
    public boolean checkSalary(int amount)
    {
        return amount >= 1000 && amount <= 75000;
    }

    // Ex. EQUIVALENCE PARTITIONING 3.
    public static int getNumDaysinMonth(int month, int year)
    {
        try
        {
            YearMonth ym = YearMonth.of( year, month );
            return ym.lengthOfMonth();
        }
        catch( DateTimeException ex )
        {
            return 0;
        }

    }
}
```

--

### ControllerTest.class
```java
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
```

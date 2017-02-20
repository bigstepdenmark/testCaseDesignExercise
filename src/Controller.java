import java.time.DateTimeException;
import java.time.YearMonth;

class Controller
{
    // Ex. EQUIVALENCE PARTITIONING 1..
    boolean isEven(int n)
    {
        return n > 0 && n <= 1000 && n % 2 == 0;
    }

    // Ex. EQUIVALENCE PARTITIONING 2.
    boolean checkSalary(int amount)
    {
        return amount >= 1000 && amount <= 75000;
    }

    // Ex. EQUIVALENCE PARTITIONING 3.
    static int getNumDaysinMonth(int month, int year)
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

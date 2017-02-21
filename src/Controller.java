import java.time.DateTimeException;
import java.time.YearMonth;

class Controller
{
    boolean isEven(int n)
    {
        return n > 0 && n <= 1000 && n % 2 == 0;
    }

    boolean checkSalary(int amount)
    {
        return amount >= 1000 && amount <= 75000;
    }

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

    int getReimbursePercentage(boolean isDeductiblePaid, boolean doctorVisit, boolean hospitalVisit)
    {
        if( isDeductiblePaid )
        {
            if( doctorVisit && !hospitalVisit )
            {
                return 50;
            }
            else if( !doctorVisit && hospitalVisit )
            {
                return 80;
            }
            else
            {
                return 0;
            }
        }
        return 0;
    }

    /**
     * Used Gregorian calendar (start 1582)
     */
    boolean isLeapYear(int year)
    {
        return year >= 1582 && ( ( year % 4 == 0 && year % 100 != 0 ) || ( year % 400 == 0 ) );
    }
}

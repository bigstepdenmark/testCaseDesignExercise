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
}

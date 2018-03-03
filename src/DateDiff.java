import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * A magic class that takes in and utilizes some ugly classes to do operations on two different dates.
 * First it formats strings and converts them to dates. It then contains methods to get the differences
 * between 2 dates, and to take a date, extract it's month, and pass that month to another class for operation.
 *
 * @version 1.0
 * @author Lucas Nolting
 */
public class DateDiff {
    private Date date1;
    private Date date2;
    private long totalDays = 0, years = 0, months = 0, days = 0, diff = 0;

    /**
     * The sole constructor of this class, it requires two strings to be input, if the strings can
     * be parsed by the constructor it creates an object that contains two dates that can be operated on.
     *
     * @exception Exception if any exceptions are encountered a message is written
     * to the console that indicates that the dates in question could not be parsed by the constructor.
     * @param d1 a String representation of a date.
     * @param d2 a String representation of a date.
     */
    DateDiff(String d1, String d2) {
        try {

            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            d1 = df.format(new Date(d1));
            d2 = df.format(new Date(d2));



            date1 = (Date) df.parse(d1);
            date2 = (Date) df.parse(d2);


        } catch (Exception e) {
            System.out.print("Date could not be formatted.\n" +
                    e.getMessage() + "\n");

        }
    }

    /**
     * This method is used for testing this class as there are no other methods
     * to access the long typed fields. It is protected because there is as of now
     * no reason for anything besides the unit tests to have access to these fields.
     *
     * @return an array of long integers that represent the operations done by the
     * following method
     */
    protected long[] getDifferencesForTests() {
        return new long[]{totalDays, years, months, days};
    }


    /**
     * This method decides which date occurred first so they can then be operated
     * on in the right order. The method then subtracts the two dates and converts a number
     * of days to years, months, and days.
     *
     * @return String representation of the total days, and those total days converted
     * to years, months, and days
     */
    public String dateSubtraction() {
        if (date1.before(date2)) {
            diff = date2.getTime() - date1.getTime();
            totalDays = diff / (1000 * 60 * 60 * 24);

            years = totalDays / 365;
            months = (totalDays - (365 * years)) / 30;
            days = totalDays - (30 * months + (365 * years));
        } else if (date2.before(date1)) {
            diff = date1.getTime() - date2.getTime();
            totalDays = diff / (1000 * 60 * 60 * 24);

            years = totalDays / 365;
            months = (totalDays - (365 * years)) / 30;
            days = (totalDays - ((30 * months) + (365 * years)));
        }

        return String.valueOf(totalDays) + "   "  + String.valueOf(years) + ", " + String.valueOf(months) + ", " + String.valueOf(days);
    }

    /**
     * This method is dependant on the FirstOfTheMonth enum, if that enum is in the
     * project this method can take the starting date of its date object and extract
     * the month from it to pass to the enum to iterate based on the month.
     */
    public  void checkMonths() {
        Calendar calDate1 = Calendar.getInstance();

        calDate1.setTime(date1);
        FirstOfTheMonth.datePicker(calDate1.get(Calendar.MONTH));
    }
}

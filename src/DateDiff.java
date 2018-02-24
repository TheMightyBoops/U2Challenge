import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class DateDiff {
    private Date date1;
    private Date date2;

    DateDiff(String d1, String d2) {
        try {

            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            d1 = df.format(new Date(d1));
            d2 = df.format(new Date(d2));

            //d1 = monthSwitcher(d1);
            //d2 = monthSwitcher(d2);

            date1 = (Date) df.parse(d1);
            date2 = (Date) df.parse(d2);

        } catch (Exception e) {
            System.out.print("Date could not be formatted.\n" +
                    e.getMessage() + "\n");

        }
    }

    public String dateSubtraction() {

        String subtractionData = "error";
        //long diff = date1.getTime() - date2.getTime();

        long totalDays = 0, years = 0, months = 0, days = 0, diff = 0;
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
        return String.valueOf(totalDays) + " " + "Days:" + String.valueOf(days) + " Months:" + String.valueOf(months) + " Years:" + String.valueOf(years);
    }

    public  void checkMonths() {
        Calendar calDate1 = Calendar.getInstance();
        Calendar calDate2 = Calendar.getInstance();

        calDate1.setTime(date1);
        FirstOfTheMonth.datePicker(calDate1.get(Calendar.MONTH));

        //if (calDate1.get(Calendar.DAY_OF_MONTH) == 1) {
        //    FirstOfTheMonth.datePicker(calDate1.get(Calendar.MONTH));
        //}

        //if (calDate2.get(Calendar.DAY_OF_MONTH) == 1) {
        //    FirstOfTheMonth.datePicker(calDate2.get(Calendar.MONTH));
        //}
    }


}

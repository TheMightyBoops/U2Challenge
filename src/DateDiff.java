import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDiff {
    private Date date1;
    private Date date2;

    DateDiff(String d1, String d2){
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

    private String monthSwitcher(String d) {
        String monthChecker = d.substring(0,2);
        switch (monthChecker) {
            case "Jan":
                d = d.replace("Jan", "1");
                break;
                case "Feb":
                d = d.replace("Feb", "2");
                break;
                case "Mar":
                d = d.replace("Mar", "3");
                break;
                case "Apr":
                d = d.replace("Apr", "4");
                break;
                case "May":
                d = d.replace("May", "5");
                break;
                case "Jun":
                d = d.replace("Jun", "6");
                break;
                case "Jul":
                d = d.replace("Jul", "7");
                break;
                case "Aug":
                d = d.replace("Aug", "8");
                break;
                case "Sep":
                d = d.replace("Sep", "9");
                break;
                case "Oct":
                d = d.replace("Oct", "10");
                break;
                case "Nov":
                d = d.replace("Nov", "11");
                break;
                case "Dec":
                d = d.replace("Dec", "12");
                break;
                default:
                    d = "error";
                    break;
        }

        return d;
    }

    public String dateSubtraction() {
        String subtractionData = "error";
        long diff = date1.getTime() - date2.getTime();
        return String.valueOf(diff);
    }
}

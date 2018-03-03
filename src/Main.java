/**
 * This main method contains all of the logic to convert strings from a csv to dates that
 * can be parsed by another class. It then invokes methods to perform operations on those dates
 * and outputs the results of those operations.
 *
 * @version 1.0
 * @author Lucas Nolting, Matt Green (FileInput Class)
 */

public class Main {
    private static FileInput in = new FileInput("date_diff.csv");

    /**
     * This method contains all of the logic that operates on the classes to
     * display a list of Days between  2 dates, along with what those dates
     * are converted to years months and days. After all the dates are output the
     * console displays how many of the lines in the csv started with a specific date.
     *
     * @param args allows the program to accept arguments from the CLI when the method is invoked.
     */
    public static void main(String[] args) {

        String[] dateString;
        String line;
        DateDiff datesToCompare;

        System.out.println("Days .  Years, Months, Days");
        while ((line = in.fileReadLine()) != null) {
            String date1, date2;
            // Modify csv lines to separate each segment with spaces.
            line = line.replace("\"", "").replace(".", ",")
                    .replace("-", ",").replace(",",",").replace("\uFEFF", "");
            dateString = line.split(",");

            date1 = dateString[0] + "-" + dateString[1] + "-" + dateString[2];
            date2 = dateString[3] + "-" + dateString[4] + "-" + dateString[5];
            date1 = date1.replace(" ","");
            date2 = date2.replace(" ","");
            datesToCompare = new DateDiff(date1,date2);

            System.out.println(datesToCompare.dateSubtraction());
            // Does the operations that edit the objects in the FOTM enum.
            datesToCompare.checkMonths();
        }

        System.out.println("===============================");

        in.fileClose();

        //Print out all objects in enum
        for (FirstOfTheMonth fir : FirstOfTheMonth.values()) {
            System.out.println(fir.toString());
        }
    }
}

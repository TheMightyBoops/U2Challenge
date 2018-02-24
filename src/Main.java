public class Main {
    public static FileInput in = new FileInput("date_diff.csv");

    public static void main(String[] args) {



        String[] dateString;
        String line;
        DateDiff datesToCompare;





        while ((line = in.fileReadLine()) != null) {
            String date1, date2;
            // Modify csv lines to separate each segment with spaces.
            line = line.replace("\"", "").replace(".", ",")
                    .replace("-", ",").replace(",",",").replace("\uFEFF", "");
            dateString = line.split(",");
            //System.out.println(dateString);
            date1 = dateString[0] + "-" + dateString[1] + "-" + dateString[2];
            date2 = dateString[3] + "-" + dateString[4] + "-" + dateString[5];
            date1 = date1.replace(" ","");
            date2 = date2.replace(" ","");
            datesToCompare = new DateDiff(date1,date2);
            //System.out.println(line);
            System.out.println(datesToCompare.dateSubtraction());
            datesToCompare.checkMonths();


        }
        in.fileClose();
        for (FirstOfTheMonth fir : FirstOfTheMonth.values()) {
            System.out.println(fir.toString());
        }

    }
}

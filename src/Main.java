public class Main {
    public static FileInput in = new FileInput("date_diff.csv");

    public static void main(String[] args) {
        for (FirstOfTheMonth fir : FirstOfTheMonth.values()) {
            System.out.println(fir.toString());
        }


        String[] dateString;
        String line;
        while ((line = in.fileReadLine()) != null) {
            // Modify csv lines to separate each segment with spaces.
            line = line.replace("\"", "").replace(".", "")
                    .replace("-", " ").replace(","," ");

            //System.out.println(line);
            dateString = line.split(" ");
            for(int i=0; i < date.length; ++i) {
                System.out.println(date[i]);

            }

        }
        in.fileClose();
    }
}

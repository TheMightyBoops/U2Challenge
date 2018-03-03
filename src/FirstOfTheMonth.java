/**
 * This enum class contains an object for each month of the year. Each object is expanded
 * by the constructor to display dates in a csv that start with a specific month.
 *
 * Note: Some of the variable names / the class name suggest that this class actually takes
 * in dates and iterates based on if the date was the first day of the month, that's because
 * on the first read-through of the assignment that's what I assumed the assignment requirement was
 * so I didn't refactor everything because only a few modifications needed to be made to convert
 * the class to one that met the actual requirements.
 *
 * @version 2.0
 * @author Lucas Nolting
 */
public enum FirstOfTheMonth {
    JAN("January"), FEB("February"), MAR("March"), APR("April"), MAY("May"), JUN("June"),
    JUL("July"), AUG("August"), SEP("September"), OCT("October"), NOV("November"),
    DEC("December");

    private final String name;
    private int datesOnTheFirst;

    /**
     * Singular constructor is invoked automatically by the enum class when a FirstOfTheMonth
     * is required. The constrictor adds a field that can be iterated on.
     * @param n = accepts a String from each enum object with a formatted version of that months name.
     */
    FirstOfTheMonth(String n) {
        this.name = n;
        this.datesOnTheFirst = 0;
    }

    /**
     * @return allows access to the Enum object's formatted name
     */
    public String getName() {return name;}

    /**
     * @return allows access to the Enum object's field that tells
     * how many dates in a csv start with the corresponding month.
     */
    public int getDatesOnTheFirst() {
        return datesOnTheFirst;
    }

    /**
     * Private method utilized by the enum to iterate the datesOfTheFirst
     * field by one.
     */
    private void iterateDatesOnTheFirst() {
         ++datesOnTheFirst;
    }

    /**
     * A static method that can be implemented by other classes to feed in months to the enum
     * to iterate how many appear at the beginning of a string in the csv.
     *
     * Note: Probably super not multi-thread safe.
     *
     * @param m month desired to be iterated by the method
     */
    public static void datePicker(int m) {
        switch (m) {
            case 0:
                FirstOfTheMonth.JAN.iterateDatesOnTheFirst();
                break;

            case 1:
                FirstOfTheMonth.FEB.iterateDatesOnTheFirst();
                break;

            case 2:
                FirstOfTheMonth.MAR.iterateDatesOnTheFirst();
                break;
            case 3:
                FirstOfTheMonth.APR.iterateDatesOnTheFirst();
                break;
            case 4:
                FirstOfTheMonth.MAY.iterateDatesOnTheFirst();
                break;
            case 5:
                FirstOfTheMonth.JUN.iterateDatesOnTheFirst();
                break;
            case 6:
                FirstOfTheMonth.JUL.iterateDatesOnTheFirst();
                break;
            case 7:
                FirstOfTheMonth.AUG.iterateDatesOnTheFirst();
                break;
            case 8:
                FirstOfTheMonth.SEP.iterateDatesOnTheFirst();
                break;
            case 9:
                FirstOfTheMonth.OCT.iterateDatesOnTheFirst();
                break;
            case 10:
                FirstOfTheMonth.NOV.iterateDatesOnTheFirst();
                break;
            case 11:
                FirstOfTheMonth.DEC.iterateDatesOnTheFirst();
                break;
        }

    }

    /**
     * Overrides the toString to get the desired format to be called by other methods invoking
     * this enum. In most applications pretty much for debugging, but also formats them to how
     * this assignment works
     *
     * @return A formatted string that gets the formatted enum name field with the dates iterated to
     */
    @Override
    public String toString() {
        return this.getName() + ": " + this.getDatesOnTheFirst();
    }
}
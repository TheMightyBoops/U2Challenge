public enum FirstOfTheMonth {
    JAN("January"), FEB("February"), MAR("March"), APR("April"), MAY("May"), JUN("June"),
    JULY("July"), AUG("August"), SEPT("September"), OCT("October"), NOV("November"),
    DECEMBER("December");

    private final String NAME = null;
    private int datesOnTheFirst;

    FirstOfTheMonth() {
        this.datesOnTheFirst = 0;
    }


    public int getDatesOnTheFirst() {
        return datesOnTheFirst;
    }

    public void iterateDatesOnTheFirst(FirstOfTheMonth m) {
        ++datesOnTheFirst;
    }
}
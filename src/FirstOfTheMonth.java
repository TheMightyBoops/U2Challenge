public enum FirstOfTheMonth {
    JAN("January"), FEB("February"), MAR("March"), APR("April"), MAY("May"), JUN("June"),
    JULY("July"), AUG("August"), SEPT("September"), OCT("October"), NOV("November"),
    DECEMBER("December");

    private final String name;
    private int datesOnTheFirst;

    FirstOfTheMonth(String n) {
        this.name = n;
        this.datesOnTheFirst = 0;
    }


    public String getName() {return name;}
    public int getDatesOnTheFirst() {
        return datesOnTheFirst;
    }

    public void iterateDatesOnTheFirst(FirstOfTheMonth m) {
        ++datesOnTheFirst;
    }

    @Override
    public String toString() {
        return this.getName() + ": " + this.getDatesOnTheFirst();
    }
}
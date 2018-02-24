public enum FirstOfTheMonth {
    JAN("January"), FEB("February"), MAR("March"), APR("April"), MAY("May"), JUN("June"),
    JUL("July"), AUG("August"), SEP("September"), OCT("October"), NOV("November"),
    DEC("December");

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
    private void iterateDatesOnTheFirst() {
         ++datesOnTheFirst;
    }

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

    @Override
    public String toString() {
        return this.getName() + ": " + this.getDatesOnTheFirst();
    }
}
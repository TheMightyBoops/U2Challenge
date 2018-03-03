import org.junit.*;
import static org.junit.Assert.*;

public class FirstOfTheMonthTest {
    @Test
    public void constructorTest() {
        for (FirstOfTheMonth testMonths : FirstOfTheMonth.values()) {
            assertTrue("A month is getting set to something other than zero.",
                    testMonths.getDatesOnTheFirst() == 0);
            assertTrue("The formatted month names have broken.", testMonths.getName() != null);
        }
    }

    @Test
    public void datePickerTest() {
        // Are dates iterating correctly via the static iterator in the enum.
        // This can be done in one test as the only thing that should access
        // the Iterator method is the datePicker method.
        for(FirstOfTheMonth testMonths : FirstOfTheMonth.values()) {
            FirstOfTheMonth.datePicker(testMonths.ordinal());
            assertTrue("The dates are not correctly iterating",
                    testMonths.getDatesOnTheFirst() == 1);
        }
    }
}

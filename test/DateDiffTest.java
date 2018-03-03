import org.junit.*;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.*;

public class DateDiffTest {
    private static DateDiff testDates, badDates;

    @Before
    public void instanceTestDates() {
        testDates = new DateDiff("8-May-93" , "Sep-24-2013");

    }

    @Test
    public  void constructorDateTest() {
        assertTrue("The constructor is broken", testDates != null);
    }

    @Test
    public void failedConstructionTest() {
        badDates = new DateDiff("Bad Dates", "Dr.Jones");
        // Make sure an exception is caught if the constructor is fed an invalid date.
        ExpectedException exception = ExpectedException.none();
        exception.expect(Exception.class);

    }

    @Test
    public void dateSubtractionTest() {
        testDates.dateSubtraction();
        long[] dates = testDates.getDifferencesForTests();

        for(int i = 0; i < dates.length; ++i) {
            assertTrue("The differences resulting from this method are broken",
                    dates[i] >= 0);
        }
    }
}

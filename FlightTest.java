import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.text.ParseException;

public class FlightTest {
    Flight myFlight;

    @Before
    public void setUp() throws ParseException {
        myFlight = new Flight(12, "SEA", "JFK", "05/20/2019", 100.00);
    }

    @Test
    public void testFlightCreation() {
        assertEquals("SEA", myFlight.getFlightOrigin());
        assertEquals("JFK", myFlight.getFlightDest());
        assertEquals(12, myFlight.getFlightNumber());
        assertEquals("05/20/2019", myFlight.getFlightDate());
    }
}

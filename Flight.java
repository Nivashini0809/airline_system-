import java.text.SimpleDateFormat;
import java.util.*;
import java.text.ParseException;

public class Flight {
    private int flightNum;
    private String flightOrigin;
    private String flightDest;
    private String flightDate;
    private double basePrice;

    public Flight(int flightNum, String flightOrigin, String flightDest, String flightDate, double basePrice) {
        if (flightNum <= 0 || flightOrigin == null || flightDest == null || flightDate == null || basePrice < 0.00) {
            throw new IllegalArgumentException("Invalid flight details provided!");
        }
        this.flightNum = flightNum;
        this.flightOrigin = flightOrigin;
        this.flightDest = flightDest;
        this.flightDate = flightDate;
        this.basePrice = basePrice;
    }

    public int getFlightNumber() { return this.flightNum; }
    public String getFlightOrigin() { return this.flightOrigin; }
    public String getFlightDest() { return this.flightDest; }
    public String getFlightDate() { return this.flightDate; }
    public double getBasePrice() { return this.basePrice; }

    public String toString() {
        return "Flight " + flightNum + " from " + flightOrigin + " to " + flightDest + " on " + flightDate;
    }
}

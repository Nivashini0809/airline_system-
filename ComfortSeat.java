public class ComfortSeat extends Seat {
    private static final int RECLINE_INCH = 6;
    private static final MealType MEAL_TYPE = MealType.Full;

    public ComfortSeat(Flight myFlight, int row, int col) {
        super(myFlight, row, col);
        if (row < 6 || row > 14 || col > 6) {
            throw new IllegalArgumentException("Invalid Comfort Class seat location.");
        }
    }

    public String toString() {
        return super.toString() + " [Comfort Class, Recline: " + RECLINE_INCH + " inches]";
    }
}

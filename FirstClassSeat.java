public class FirstClassSeat extends Seat {
    private static final int RECLINE_INCH = 8;
    private static final MealType MEAL_TYPE = MealType.Gourmet;

    public FirstClassSeat(Flight myFlight, int row, int col) {
        super(myFlight, row, col);
        if (row > 5 || col > 4) {
            throw new IllegalArgumentException("Invalid First Class seat location.");
        }
    }

    public String toString() {
        return super.toString() + " [First Class, Recline: " + RECLINE_INCH + " inches]";
    }
}

public class EconomySeat extends Seat {
    private static final int RECLINE_INCH = 3;
    private static final MealType MEAL_TYPE = MealType.Snack;

    public EconomySeat(Flight myFlight, int row, int col) {
        super(myFlight, row, col);
        if (row < 15 || row > 44 || col > 8) {
            throw new IllegalArgumentException("Invalid Economy Class seat location.");
        }
    }

    public String toString() {
        return super.toString() + " [Economy Class, Recline: " + RECLINE_INCH + " inches]";
    }
}

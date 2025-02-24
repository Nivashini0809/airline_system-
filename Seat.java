public abstract class Seat {
    private int row;
    private int col;
    private Flight myFlight;
    private Confirmation conf;
    private boolean isBooked;

    public enum MealType { Gourmet, Full, Snack }

    public Seat(Flight myFlight, int row, int col) {
        if (row < 0 || col < 0) {
            throw new IllegalArgumentException("Invalid row/column values!");
        }
        this.row = row;
        this.col = col;
        this.myFlight = myFlight;
    }

    public String getSeatNumber() {
        return row + String.valueOf((char) ('A' + col));
    }

    public boolean isBooked() { return conf != null; }
    public void addConfirmation(Confirmation conf) { this.conf = conf; }
    public String toString() { return "Seat " + getSeatNumber() + " on Flight " + myFlight.getFlightNumber(); }
}

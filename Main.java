public class Main {
    public static void main(String[] args) {
        System.out.println("Running the Flight System...");
        
        // Creating a flight with valid details
        Flight flight = new Flight(101, "SEA", "JFK", "12/25/2025", 150.0);
        System.out.println("Flight created: " + flight);

        // Creating and assigning seats
        FirstClassSeat firstSeat = new FirstClassSeat(flight, 1, 2);
        ComfortSeat comfortSeat = new ComfortSeat(flight, 7, 2);
        EconomySeat economySeat = new EconomySeat(flight, 15, 5);

        // Creating customer confirmation
        Confirmation conf = new Confirmation("Alex", "123456", false);
        firstSeat.addConfirmation(conf);

        // Displaying seat details
        System.out.println(firstSeat);
        System.out.println(comfortSeat);
        System.out.println(economySeat);
    }
}

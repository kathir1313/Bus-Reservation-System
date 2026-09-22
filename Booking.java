public class Booking {

    private static int counter = 1001;

    private String ticketId;
    private String passengerName;
    private int busNo;

    public Booking(String passengerName, int busNo) {
        this.ticketId = "TKT" + counter++;
        this.passengerName = passengerName;
        this.busNo = busNo;
    }

    public String getTicketId() {
        return ticketId;
    }

    @Override
    public String toString() {
        return "Ticket ID : " + ticketId +
                " | Passenger : " + passengerName +
                " | Bus No : " + busNo;
    }
}
public class Bus {

    private int busNo;
    private String from;
    private String to;
    private int capacity;
    private double fare;
    private int bookedSeats = 0;

    public Bus(int busNo, String from, String to, int capacity, double fare) {
        this.busNo = busNo;
        this.from = from;
        this.to = to;
        this.capacity = capacity;
        this.fare = fare;
    }

    public int getBusNo() {
        return busNo;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getFare() {
        return fare;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public boolean isAvailable() {
        return bookedSeats < capacity;
    }

    public void bookSeat() {
        bookedSeats++;
    }

    public int getAvailableSeats() {
        return capacity - bookedSeats;
    }

    public void displayBusInfo() {
        System.out.println("------------------------------------------------");
        System.out.println("Bus No : " + busNo);
        System.out.println("Route : " + from + " -> " + to);
        System.out.println("Fare : ₹" + fare);
        System.out.println("Available Seats : " + getAvailableSeats());
        System.out.println("------------------------------------------------");
    }
}
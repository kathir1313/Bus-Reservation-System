import java.util.ArrayList;
import java.util.Scanner;

public class BusReservationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();

        buses.add(new Bus(101,"Chennai","Coimbatore",40,750));
        buses.add(new Bus(102,"Bangalore","Chennai",35,650));
        buses.add(new Bus(103,"Erode","Chennai",45,550));
        buses.add(new Bus(104,"Madurai","Chennai",50,700));
        buses.add(new Bus(105,"Salem","Coimbatore",30,300));
        buses.add(new Bus(106,"Trichy","Chennai",40,500));
        buses.add(new Bus(107,"Tirunelveli","Chennai",45,900));
        buses.add(new Bus(108,"Vellore","Coimbatore",35,650));
        buses.add(new Bus(109,"Kanyakumari","Madurai",40,450));
        buses.add(new Bus(110,"Thoothukudi","Chennai",50,850));
        buses.add(new Bus(111,"Erode","Bangalore",35,600));
        buses.add(new Bus(112,"Coimbatore","Mysore",30,500));
        buses.add(new Bus(113,"Madurai","Trichy",25,250));
        buses.add(new Bus(114,"Salem","Chennai",40,550));
        buses.add(new Bus(115,"Karur","Coimbatore",30,200));

        int choice;

        do {

            System.out.println("\n===== BUS RESERVATION SYSTEM =====");
            System.out.println("1. View Buses");
            System.out.println("2. Book Ticket");
            System.out.println("3. View Bookings");
            System.out.println("4. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    for (Bus bus : buses) {
                        bus.displayBusInfo();
                    }

                    break;

                case 2:

                    sc.nextLine();

                    System.out.print("Enter Passenger Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Bus Number : ");
                    int busNo = sc.nextInt();

                    boolean found = false;

                    for (Bus bus : buses) {

                        if (bus.getBusNo() == busNo) {

                            found = true;

                            if (bus.isAvailable()) {

                                bus.bookSeat();

                                Booking booking =
                                        new Booking(name, busNo);

                                bookings.add(booking);

                                System.out.println(
                                        "\nTicket Booked Successfully");

                                System.out.println(
                                        booking);

                            } else {

                                System.out.println(
                                        "Bus Full");
                            }
                        }
                    }

                    if (!found) {
                        System.out.println(
                                "Invalid Bus Number");
                    }

                    break;

                case 3:

                    if (bookings.isEmpty()) {

                        System.out.println(
                                "No Bookings Found");

                    } else {

                        for (Booking booking : bookings) {

                            System.out.println(
                                    booking);
                        }
                    }

                    break;

                case 4:

                    System.out.println(
                            "Thank You!");

                    break;

                default:

                    System.out.println(
                            "Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
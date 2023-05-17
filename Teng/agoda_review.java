import java.util.LinkedList;

/*
 * create room <room-name>
 * book <room-id> <start-date> <exit-date>
 * cancel <booking-id>
 * 
 * ex input
 * 
 * 7
 * create room Suite id = 1
 * book 1 5 10
 * create room Deluxe id = 2
 * book 2 1 10
 * book 2 12 21
 * book 2 20 25
 * cancel 4
 * 
 * ex output
 * 
 * Room: Suite
 * Booking Id 1: 5 -> 10
 * Booking Id 3: 12 -> 18
 * 
 * Room: Deluxe
 * Booking Id 2: 1 -> 10
 */

public class agoda_review {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            String action = sc.next();
            if (action.equalsIgnoreCase("create")) {
                sc.next();
                String roomName = sc.next();
                Room.addRoom(roomName);
            }

            else if (action.equalsIgnoreCase("book")) {
                int roomId = sc.nextInt();
                int startDate = sc.nextInt();
                int endDate = sc.nextInt();
                Room.addSheet(roomId, startDate, endDate);
                Room.Rooms.get(roomId - 1).bookRoom(startDate, endDate);
            }

            else if (action.equalsIgnoreCase("cancel")) {
                int cancelId = sc.nextInt();
                Room.cancel(cancelId);
            }
        }
        for (Room x : Room.Rooms) {
            System.out.println("Room: " + x.roomName);
            for (BookingSheet y : Room.bookingSheets) {
                if (y.roomId == x.roomId && y.isBooked) {
                    System.out.println("Booking Id " + y.id + ": " + y.startDate + " -> " + y.endDate);
                }
            }
        }
        sc.close();
    }
}

class Room {
    static LinkedList<Room> Rooms = new LinkedList<>();
    static LinkedList<BookingSheet> bookingSheets = new LinkedList<>();
    boolean[] isBookedDate = new boolean[1000];

    static int roomNumber = 1;
    String roomName;
    int roomId;

    public Room(String roomName) {
        this.roomName = roomName;
        roomId = roomNumber++;
    }

    public static void addSheet(int roomId, int startDate, int endDate) {
        bookingSheets.add(new BookingSheet(roomId, startDate, endDate));
    }

    public static void addRoom(String roomName) {
        Rooms.add(new Room(roomName));
    }

    public boolean bookRoom(int startDate, int endDate) {
        if (!isBookable(startDate, endDate)) {
            // System.out.println("This date can't be book");
            return false;
        }
        for (int i = startDate; i <= endDate; i++) {
            isBookedDate[i] = true;
        }
        bookingSheets.getLast().isBooked = true;
        return true;
    }

    public boolean isBookable(int startDate, int endDate) {
        boolean checker = true;
        for (int i = startDate; i <= endDate; i++) {
            if (isBookedDate[i]) {
                checker = false;
                break;
            }
        }
        return checker;
    }

    public static void cancel(int bookingId) {
        if (!bookingSheets.get(bookingId - 1).isBooked)
            return;
        int startDate = bookingSheets.get(bookingId - 1).startDate;
        int endDate = bookingSheets.get(bookingId - 1).endDate;
        for (int i = startDate; i <= endDate; i++) {
            Rooms.get(bookingSheets.get(bookingId - 1).roomId - 1).isBookedDate[i] = false;
        }
        bookingSheets.get(bookingId - 1).isBooked = false;
    }
}

class BookingSheet {
    static int dataId = 1;
    int id;
    int roomId;
    int startDate;
    int endDate;
    boolean isBooked = false;

    public BookingSheet(int roomId, int startDate, int endDate) {
        id = dataId++;
        this.roomId = roomId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

}
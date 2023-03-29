import java.util.Scanner;

public class PlaneApp{
    
    public static void main(String[] args){

        Plane CAplane = new Plane(); 
        Scanner sc = new Scanner(System.in);

        System.out.println("(1) Show number of empty seats \n" +
        "(2) Show the list of empty seats \n" +
        "(3) Show the list of seat assignments by seat ID \n" +
        "(4) Show the list of seat assignments by customer ID \n" +
        "(5) Assign a customer to a seat \n" +
        "(6) Remove a seat assignment \n" +
        "(7) Exit");

        int choice; int seatId; int cust_id;

        do{
            System.out.println("Enter the number of your choice:");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    CAplane.showNumEmptySeats();
                    break;

                case 2:
                    CAplane.showEmptySeats();
                    break;

                case 3:
                    CAplane.showAssignedSeats(true);
                    break;

                case 4:   //messes up option 2
                    CAplane.showAssignedSeats(false);
                    break;

                case 5:
                    System.out.println("Assigning Seat ...");
                    System.out.println("Please enter SeatID: ");
                    seatId = sc.nextInt();
                    System.out.println("Please enter Customer ID: ");
                    cust_id = sc.nextInt();
                    CAplane.assignSeat(seatId, cust_id);
                    break;

                case 6:
                    System.out.println("Enter SeatID to unassign customer from:");
                    seatId = sc.nextInt();
                    CAplane.unassignSeat(seatId);
                    break;
            }
        } while(choice < 7);

        sc.close();

    }

}
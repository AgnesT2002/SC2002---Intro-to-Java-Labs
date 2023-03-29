
public class Plane extends PlaneSeat{

    protected PlaneSeat[] seat;
    protected int numEmptySeat;

    public Plane()
    {
        seat = new PlaneSeat[12]; //array of 12 seats
        for (int i=0; i<12; i++) seat[i] = new PlaneSeat(i+1);
        numEmptySeat = 12;
    }

    private PlaneSeat[] sortSeats()
    {
        PlaneSeat[] copy = new PlaneSeat[12];
        for (int i=0; i<12; i++)         //copy = seat does not work
        {
            copy[i] = new PlaneSeat();
            copy[i] = seat[i];
        }
        PlaneSeat temp;
        int n = 12;
        for(int i=0; i<n; i++)
        {
            for (int j=i; j>0; j--)
            {
                if (copy[j].getCustomerID() < copy[j-1].getCustomerID())
                {
                    temp = copy[j];
                    copy[j] = copy[j-1];
                    copy[j-1] = temp;
                }
                else break;
            }
        }
        return copy;
    }

    public void showNumEmptySeats()
    {
        System.out.println("Number of Empty Seats: " + numEmptySeat);
    }

    public void showEmptySeats()
    {
        System.out.println("The following seats are empty:");
        for (int i=0; i<12; i++)
        {
            if(!seat[i].isOcuppied()) System.out.println("SeatID " + (i+1));
        }
    }

    public void showAssignedSeats(boolean bySeatId)
    {
        if(bySeatId)
        {
            for (int i=0; i<12; i++)
            {
                if(seat[i].isOcuppied()) 
                    System.out.println("SeatID " + (i+1) + " assigned to CustomerID " + seat[i].getCustomerID());
            }
        }
        else
        {
            PlaneSeat[] seat_copy = sortSeats();
            for (int i=0; i<12; i++)
            {
                if(seat_copy[i].isOcuppied()) 
                    System.out.println("SeatID " + seat_copy[i].getSeatID() + " assigned to CustomerID " + seat_copy[i].getCustomerID());
            }
        }
    }

    public void assignSeat(int seatId, int cust_id)
    {
        if(numEmptySeat==0) System.out.println("Sorry the plane is full!");
        else if (seat[seatId-1].assigned) System.out.println("Seat already assigned to a customer.");
        else
        {
            seat[seatId-1].assign(cust_id);
            numEmptySeat--;
        }
    }

    public void unassignSeat(int seatId)
    {
        if(numEmptySeat == 12) System.out.println("The plane is empty!");
        else if (!seat[seatId-1].assigned) System.out.println("Seat already empty.");
        else
        {
            seat[seatId-1].unassign();
            numEmptySeat++;
        }
    }
}
public class PlaneSeat{
    protected int seatId;
    protected boolean assigned;
    protected int customerId;

    public PlaneSeat()
    {
        seatId = -1;
        assigned = false;
        customerId = 0;
    }
    public PlaneSeat(int Seat_id)
    {
        seatId = Seat_id;
        assigned = false;
        customerId = 0;
    }

    public int getSeatID()
    {
        return seatId;
    }

    public int getCustomerID()
    {
        return customerId;
    }

    public boolean isOcuppied()
    {
        return assigned;
    }

    public void assign(int cust_id)
    {
        customerId = cust_id;
        assigned = true;
        System.out.println("Seat Assigned!");
    }

    public void unassign()
    {
        customerId = 0;
        assigned = false;
        System.out.println("Seat Unassigned!");
    }
}
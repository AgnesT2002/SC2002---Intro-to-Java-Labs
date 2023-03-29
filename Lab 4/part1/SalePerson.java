public class SalePerson implements Comparable {
    
    private String firstName;
    private String lastName;
    private int totalSales;

    public SalePerson(String firstname, String lastName, int totalSales)
    {
        this.firstName = firstname;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    public String toString()
    {
        return(lastName + ", " + firstName + ", " + totalSales);
    }

    public boolean equals(Object o)
    {
        SalePerson s = (SalePerson) o;
        if (s.firstName == firstName && s.lastName == lastName) return true;

        return false;
        
    }

    public int compareTo(Object o)
    {
        SalePerson s = (SalePerson) o;
        if (totalSales == s.totalSales) 
            return s.lastName.compareTo(lastName);   //alphabetical order - A first
        
        return totalSales - s.totalSales;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getTotalSales()
    {
        return totalSales;
    }
}

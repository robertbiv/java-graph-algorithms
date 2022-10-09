//Robert Bennethum (Payment Problem)
public class Payment {
    //Variables
    private double amnt;
    public Payment(double amnt) //constructor
    {this.amnt = amnt; }

    //setters and getters
    public double getAmnt()
    { return amnt; }

    public void setAmnt(double amnt)
    { this.amnt = amnt; }

    //print
    public void paymentDetails()
    { System.out.println("\n Payment: $"+amnt); }
}

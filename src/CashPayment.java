//Robert Bennethum (Payment Problem)
class CashPayment extends Payment
{
    public CashPayment(double amnt)
    { super(amnt); } //use payment class for cash

    public void paymentDetails() //print payment for cash
    { System.out.println("\n Payment: $"+getAmnt()+ " in cash"); }
}
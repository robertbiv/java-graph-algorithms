//Robert Bennethum (Payment Problem)
class CreditCardPayment extends Payment
{
    //Variables
    private String name;
    private String expDate;
    private int cardNum;

    //constructor
    public CreditCardPayment(double amount,String name,String expDate,int cardNum)
    {
        super(amount);
        this.name = name;
        this.expDate = expDate;
        this.cardNum = cardNum;
    }
    public void paymentDetails() //print cc payment
    { System.out.println("\n Payment: $"+ getAmnt()+ "\nCard Number: "+cardNum +"\nExpiration Date:"+expDate + "\nCard Holder:"+name); }
}
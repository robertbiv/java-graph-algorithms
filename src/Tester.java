//Robert Bennethum IV CompSci 221
import java.io.IOException;
import java.util.Scanner; // Import the Scanner class to read text files

public class Tester {
    public static void main(String[] args) throws IOException {
        //For Payment Problem
        //Cash
        CashPayment cp1 = new CashPayment(9134.30);
        cp1.paymentDetails();
        CashPayment cp2 = new CashPayment(563.79);
        cp2.paymentDetails();
        //CC
        CreditCardPayment ccp1 = new CreditCardPayment(10.10,"Johnny Appleseed","09/14/2022",26234342);
        ccp1.paymentDetails();
        CreditCardPayment ccp2 = new CreditCardPayment(420.00,"Snoop Dogg","04/20/2020",32152345);
        ccp2.paymentDetails();

        System.out.println("\n");
        //For Movie Problem
        // creating objects
        Movie m1=new Comedy("R",111,"The Godfather");
        Movie m2=new Action("PG",222,"Vertigo");
        Movie m3=new Drama("PG-13",333,"Forrest Gump");
        Movie m4=new Movie("PG-13",111,"12 Angry Men");

        // getting values and passing arguments to calculate LateFees and checking duplicate Id Number
        System.out.println('\n');
        System.out.println(m1.toString()+"\t"+"Id exists="+m1.equals(m3)+"\t"+"LateFees="+m1.calcLateFees(2));
        System.out.println(m2.toString()+"\t"+"Id exists="+m2.equals(m3)+"\t"+"LateFees="+m2.calcLateFees(4));
        System.out.println(m3.toString()+"\t"+"Id exists="+m3.equals(m3)+"\t"+"LateFees="+m3.calcLateFees(6));
        System.out.println(m4.toString()+"\t"+"Id exists="+m4.equals(m1)+"\t"+"LateFees="+m4.calcLateFees(4));


        System.out.println("\n");
        //For Shape Problem
        Circle c=new Circle(4);
        Rectangle r=new Rectangle(4,3);
        ShowArea(c);
        ShowArea(r);


        System.out.println("\n");
        //For MovieReview
        MovieReview M=new MovieReview();
        M.run();


        System.out.println("\n");
        //For Registration Problem
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the data, -1 as id to stop\n");
        int id;
        String course, userEntry, sID;
        RegistrationProblem test = new RegistrationProblem();
        while(true)
        {
            userEntry=input.next();
            sID=userEntry.substring(0,1);
            if(!sID.equals("-"))
            {
                id=Integer.parseInt(userEntry.substring(0,1));
                int len=userEntry.length();
                course=input.next();
                test.insertData(id,course);
            }
            else
                break;
        }
        test.printData();

        System.out.println("\n");
        //For Maze Problem
        Maze m=new Maze();
        m.run();

    }
    //for testing Shape Problem
    public static void ShowArea(Shape s)
    {
        double area=s.area();
        System.out.println("The area of the shape is "+area);
    }
}

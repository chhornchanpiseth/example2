import java.util.Scanner;   //Scanner is a class in java. util package used for obtaining the input of the primitive types like int, double, etc. and strings
public class Code {

    int ConsumerNo;
    String ConsumerName;
    int PrevReading;
    int CurrReading;
    String EBConn;
    double Bill;        //  double is used to represent floating-point numbers. It uses 64 bits to store a variable value and has a range greater than float type
    void input_data()   //When should void be used in Java?
                            // In Java, void keyword is used with the method declaration to specify that this particular method is not going to return any value after completing its execution.
    {
        Scanner sc = new Scanner(System.in);   // "System.in : for user to input data"
        System.out.println("\n Enter Consumer Number: ");   // "System.out.println" : "print"
        ConsumerNo = sc.nextInt();
        System.out.println("\n Enter Consumer Name: ");
        ConsumerName = sc.next();
        System.out.println("\n Enter Previous Units: ");
        PrevReading = sc.nextInt();
        System.out.println("Enter Current Units consumed:");
        CurrReading = sc.nextInt();
        System.out.println("Enter the types of EB Connection(domestic or commercial)");
        EBConn = sc.next();
    }

    double calculate_bill() {
        int choice;
        if(EBConn=="domenstic")
            choice = 1;
        else
            choice=2;
        switch(choice) {
            case 1:
                if(CurrReading>=0 && CurrReading<=100)
                    Bill=CurrReading*1;
                else if(CurrReading>100 && CurrReading <= 200)
                    Bill=(100*1)+((CurrReading-100)*2.50);
                else if(CurrReading>200 && CurrReading <= 500)
                    Bill=(100*1)+(100*2.50)+((CurrReading-200)*4);
                else
                    Bill=(100*1)+(100*2.50)+(300*4)+((CurrReading-500)*6);
            break;
            case 2:
                if(CurrReading>=0 && CurrReading<=100)
                    Bill=CurrReading*2;
                else if(CurrReading>100 && CurrReading <= 200)
                    Bill=(100*1)+((CurrReading-100)*4.50);
                else if(CurrReading>200 && CurrReading <= 500)
                    Bill=(100*1)+(100*2.50)+((CurrReading-200)*6);
                else
                    Bill=(100*1)+(100*2.50)+(300*4)+((CurrReading-500)*7);
            break;
        }
        return Bill;
    }
    void display()
    {
        System.out.println("----------------------------------");
        System.out.println("ELCTRICITY BILL");
        System.out.println("----------------------------------");
        System.out.println("Consumer Number: "+ConsumerNo);
        System.out.println("Consumer Name: "+ConsumerName);
        System.out.println("Consumer Previous Units: "+PrevReading);
        System.out.println("Consumer Current Units: "+CurrReading);
        System.out.println("Type of EBConnection: "+EBConn);
        System.out.println("----------------------------------");
        System.out.println("Total Amount(Rs.): "+Bill);
    }


}
class EBillGen
{
    public static void main (String[] args)
    {
    Code b=new Code();
    b.input_data();
    b.calculate_bill();
    b.display();
    }
}

package shipmentCompanyPackage;
import java.util.*;
class Customers
{
    String Name;
    String CustomerType;
    String Address;
    Shipment shipment;

}

class Shipment
{
    String CustomerID;
    String ShipmentID;
    String ShipmentType;
    Date ShipmentDateAndTime;
    String From;
    String To;
    Double Length;
    Double Breadth;
    Double Height;
    Double Weight;
    int Quantity;
}

public class ShipmentCompany
{
    int getPrice(double Weight)
    {
        if(Weight<=50)
            return 10000;
        else if (Weight>50 && Weight<=100)
            return 15000;
        else if (Weight>100 && Weight<=1000)
            return 25000;
        else
            return 35000;
    }
    public static void main(String[] args)
    {
        System.out.println("hello");



    }
}


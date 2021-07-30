import java.util.Scanner;
class vehicle{
    private String make;
    private String vehicleNo;
    private String fuelType;
    private String fuelCapacity;
    private int cc;

    void setMake(String make)
    {
        this.make = make;
    }
    String getMake()
    {
        return this.make;
    }
    void setvehicleNo(String vehicleNo)
    {
        this.vehicleNo = vehicleNo;
    }
    String getvehicleNo()
    {
        return this.vehicleNo;
    }
    void setfuelType(String fuelType)
    {
        this.fuelType = fuelType;
    }
    String getfuelType()
    {
        return this.fuelType;
    }
    void setfuelCapacity(String fuelCapacity)
    {
        this.fuelCapacity = fuelCapacity;
    }
    String getfuelCapacity()
    {
        return this.fuelCapacity;
    }
    void setcc(int cc)
    {
        this.cc = cc;
    }
    int getcc()
    {
        return this.cc;
    }
    void displayMake()
    {
        System.out.println("Make"+make);
    }
    void displayBasicinfo()
    {
        System.out.println("Make: "+make+"\nvehicleNo:"+vehicleNo+"\nFuel Type:"+fuelType+"\nFuel Capacity:"+fuelCapacity+"\nCC:"+cc);
    }
    void displayDetailinfo()
    {
    }
}

class FourWheeler extends vehicle{
    private String audioSystem;
    private int numberOfDoors;
    
    void setaudioSytem(String audioSystem)
    {
        this.audioSystem = audioSystem;
    }
    String getaudioSystem()
    {
        return this.audioSystem;
    }
    void setnumberOfDoors(int numberOfDoors)
    {
        this.numberOfDoors = numberOfDoors;
    }
    int getnumberOfDoors()
    {
        return this.numberOfDoors;
    }
    public void displayDetailinfo()
    {
        System.out.println("Audio System:"+audioSystem+"\nNumber of doors:"+numberOfDoors);
    }
}

class TwoWheeler extends vehicle
{
    private String KickStart;
    
    void setKickStart(String KickStart)
    {
        this.KickStart = KickStart;
    }
    String getKickStart()
    {
        return this.KickStart;
    } 
    public void displayDetailinfo()
    {
        System.out.println("Kickstart:"+KickStart);
    }

}
public class MyClass {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("1.FourWheeler\n2.TwoWheeler\nEnter Vehicle Type");
      int choice = sc.nextInt();
      System.out.println("Enter Vehicle Make");
      String make;
      make = sc.next();
      System.out.println("Enter Vehicle Number");
      String vehicleNo;
      vehicleNo= sc.next();
      System.out.println("1.Petrol\n2.Diesel\nEnter Fuel Type");
      int fuelchoice;
      fuelchoice = sc.nextInt();
      String fuelType;
      if(fuelchoice == 1)
      {
          fuelType= "Petrol";
      }else
      {
          fuelType = "Diesel";
      }
      System.out.println("Enter Fuel Capacity");
      String fuelCapacity;
      fuelCapacity = sc.next();
      System.out.println("Enter cc");
      int cc;
      cc = sc.nextInt();
      if(choice == 1)
      {
          String audioSystem;
          System.out.println("Enter Audio System Name");
          audioSystem = sc.next();
          int numberOfDoors;
          System.out.println("Enter Number of Doors");
          numberOfDoors = sc.nextInt();
          
          FourWheeler vehicleObj = new FourWheeler();
          
          vehicleObj.setMake(make);
          vehicleObj.setvehicleNo(vehicleNo);
          vehicleObj.setfuelType(fuelType);
          vehicleObj.setfuelCapacity(fuelCapacity);
          vehicleObj.setcc(cc);
          vehicleObj.setaudioSytem(audioSystem);
          vehicleObj.setnumberOfDoors(numberOfDoors);
          vehicleObj.displayBasicinfo();
          vehicleObj.displayDetailinfo();
      }else
      {
          String KickStart;
          System.out.println("Kickstart Available(yes/no):");
          KickStart = sc.next();
          TwoWheeler vehicleObj = new TwoWheeler();
          vehicleObj.setMake(make);
          vehicleObj.setvehicleNo(vehicleNo);
          vehicleObj.setfuelType(fuelType);
          vehicleObj.setfuelCapacity(fuelCapacity);
          vehicleObj.setcc(cc);
          vehicleObj.setKickStart(KickStart);
          vehicleObj.displayBasicinfo();
          vehicleObj.displayDetailinfo();
      }
      sc.close();
}
}
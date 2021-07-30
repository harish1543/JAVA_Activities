import java.util.Scanner;

class HotelRoom {
	protected String hotelName;
	protected int numberOfSqFeet;
	protected boolean hasTV;
	protected boolean hasWifi;
	
	public HotelRoom() {
		this.hotelName="";
		this.numberOfSqFeet=0;
		this.hasTV=false;
		this.hasWifi=false;
	}

	public HotelRoom(String hotelName,Integer numberOfSqFeet,Boolean hasTV,Boolean hasWifi) {

		this.hotelName=hotelName;
		this.numberOfSqFeet=numberOfSqFeet;
		this.hasTV=hasTV;
		this.hasWifi=hasWifi;
		
		
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getNumberOfSqFeet() {
		return numberOfSqFeet;
	}

	public void setNumberOfSqFeet(int numberOfSqFeet) {
		this.numberOfSqFeet = numberOfSqFeet;
	}

	public boolean isHasTV() {
		return hasTV;
	}

	public void setHasTV(boolean hasTV) {
		this.hasTV = hasTV;
	}

	public boolean isHasWifi() {
		return hasWifi;
	}

	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}
	
	public int calculateTariff() {
		
		return 0;
	}
	
	public int getRatePerSqFeet() {
		return 0;
	}

}

class DeluxeRoom extends HotelRoom{
	protected int ratePerSqFeet;
	
	public DeluxeRoom() {

		super();
		this.ratePerSqFeet = 10;
	}

	public DeluxeRoom(String hotelName,Integer numberOfSqFeet,Boolean hasTV,Boolean hasWifi,int ratePerSqFeet) {
		super(hotelName,numberOfSqFeet,hasTV,hasWifi);
		this.ratePerSqFeet = ratePerSqFeet;
	}
	
	public int getRatePerSqFeet() {
		if(isHasWifi()) {
			return ratePerSqFeet+2;
		}
		else {
			return ratePerSqFeet;
		}
		
	}

	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}

	public int calculateTariff() {
			
			return getRatePerSqFeet()*super.getNumberOfSqFeet();
		}
		
	
}

class DeluxeACRoom extends DeluxeRoom {

	public DeluxeACRoom() {
	    
		super();
		setRatePerSqFeet(12);
	}

	public DeluxeACRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi, int ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi, 12);

	}
	
	public int calculateTariff() {
		
		return getRatePerSqFeet()*super.getNumberOfSqFeet();
	}

}

class SuiteACRoom extends HotelRoom {
	private  int ratePerSqFeet;

	public int getRatePerSqFeet() {
		if(isHasWifi()) {
			return ratePerSqFeet+2;
		}
		else {
			return ratePerSqFeet;
		}
		
	}

	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}

	public SuiteACRoom() {

		super();
		setRatePerSqFeet(15);
		
	}
	public SuiteACRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		setRatePerSqFeet(15);

	}
	
	public int calculateTariff() {
		
		return getRatePerSqFeet()*super.getNumberOfSqFeet();
	}

}
public class MyClass {
   public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int ch;
		System.out.println("\nHotel Tariff Calculator\n1. Deluxe Room\n2. Deluxe AC Room\n3. Suite AC Room\nSelect Room Type:");
		ch=sc.nextInt();
		switch(ch) {
		case 1:
		       DeluxeRoom dr=new DeluxeRoom();
			   System.out.println("Hotel Name:");
			   sc.nextLine();
			   dr.setHotelName(sc.nextLine());
			   System.out.println("Room Square Feet Area:");
			   dr.setNumberOfSqFeet(sc.nextInt());
			   System.out.println("Room has Tv(yes/no):");
			   sc.nextLine();
			   String c=sc.nextLine();
			   if(c.equals("yes")) {
				   dr.setHasTV(true);
			   }
			   else {
				   dr.setHasTV(false);
			   }
			   System.out.println("Room has Wifi(yes/no):");
			   String d=sc.nextLine();
			   if(d.equals("yes")) {
				   dr.setHasWifi(true);
			   }
			   else {
				   dr.setHasWifi(false);
			   }
			   System.out.println("Room Tarrif per day is:"+dr.calculateTariff());
		       break;
		
		case 2: 
		       DeluxeACRoom dar=new DeluxeACRoom();
			   System.out.println("Hotel Name:");
			   sc.nextLine();
			   dar.setHotelName(sc.nextLine());
			   System.out.println("Room Square Feet Area:");
			   dar.setNumberOfSqFeet(sc.nextInt());
			   System.out.println("Room has Tv(yes/no):");
			   sc.nextLine();
			   String e=sc.nextLine();
			   if(e.equals("yes")) {
				   dar.setHasTV(true);
			   }
			   else {
				   dar.setHasTV(false);
			   }
			   System.out.println("Room has Wifi(yes/no):");
			   String f=sc.nextLine();
			   if(f.equals("yes")) {
				   dar.setHasWifi(true);
			   }
			   else {
				   dar.setHasWifi(false);
			   }
			   System.out.println("Room Tarrif per day is:"+dar.calculateTariff());
		       break;
		case 3: 
		       SuiteACRoom sar=new SuiteACRoom();
			   System.out.println("Hotel Name:");
			   sc.nextLine();
			   sar.setHotelName(sc.nextLine());
			   System.out.println("Room Square Feet Area:");
			   sar.setNumberOfSqFeet(sc.nextInt());
			   System.out.println("Room has Tv(yes/no):");
			   sc.nextLine();
			   String g=sc.nextLine();
			   if(g.equals("yes")) {
				   sar.setHasTV(true);
			   }
			   else {
				   sar.setHasTV(false);
			   }
			   System.out.println("Room has Wifi(yes/no):");
			   String h=sc.nextLine();
			   if(h.equals("yes")) {
				   sar.setHasWifi(true);
			   }
			   else {
				   sar.setHasWifi(false);
			   }
			   System.out.println("Room Tarrif per day is:"+sar.calculateTariff());
		       break;
		}
		
}
}
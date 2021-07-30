import java.util.Scanner;
class Customer {
	private String name;
	private String address;
	private String mobile;
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	public String getaddress() {
		return address;
	}
	
	public void setaddress(String address) {
		this.address=address;
	}

	public String getmobile() {
		return mobile;
	}
	
	public void setmobile(String mobile) {
		this.mobile=mobile;
	}

}
public class CustomerMain {

	public static void main(String[] args) {
		Customer c=new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the details(name,address,mobile):");
		String[] arrofStr=sc.nextLine().split(",");
		c.setname(arrofStr[0]);
		c.setaddress(arrofStr[1]);
		c.setmobile(arrofStr[2]);
		
		System.out.println("Name: "+c.getname());
		System.out.println("Address: "+c.getaddress());
		System.out.println("Mobile: "+c.getmobile());

	}

}

import java.util.*;

class Company {
	private String name;
	private String employees;
	private String teamlead;
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	public String getemployees() {
		return employees;
	}
	
	public void setemployees(String employees) {
		this.employees=employees;
	}
	

	public String getteamlead() {
		return teamlead;
	}
	
	public void setteamlead(String teamlead) {
		this.teamlead=teamlead;
	}
}
public class CompanyMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Company cmp=new Company();
		System.out.println("Enter the company name: ");
		cmp.setname(sc.nextLine());
		System.out.println("Enter the employees: ");
		cmp.setemployees(sc.nextLine());
		System.out.println("Enter TeamLead");
		cmp.setteamlead(sc.nextLine());
		String[]c=cmp.getemployees().split(",");
		int flag=0;
		for(String x:c) {
			if(x.equals(cmp.getteamlead())) {
				flag=1;
				break;
			}
			
		}
		
		if(flag==0) {
			System.out.println("Invalid input.");
		}
		else {
			System.out.println("Name: "+cmp.getname());
			System.out.println("Employees: "+cmp.getemployees());
			System.out.println("Lead: "+cmp.getteamlead());
		}
		
		
	}

}
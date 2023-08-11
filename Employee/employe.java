package Employee;

public class employe {
	private String name ;
	private String jobtitle;
	private double salary;
	
	
	public employe(String name, String jobtitle, double salary) {
        this.name = name;
        this.jobtitle = jobtitle;
        this.salary = salary;
    }

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getJobtitle() {
		return jobtitle;
	}


	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void raisesalary(double percentage) {
	salary=salary+salary*percentage/100;
	}
	public void printemployedetails() {
		System.out.println("Name:"+name);
		System.out.println("job title:"+jobtitle);
		System.out.println("salary:"+salary);
		
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 employe employee = new employe("SAMPATH", "Software Engineer", 1000);

		 System.out.println("Name: " + employee.getName());
	        System.out.println("Job Title: " + employee.getJobtitle());
	        System.out.println("Salary: " + employee.getSalary());
	        
	        employee.raisesalary(5); 
	        employee.setSalary(1000); 

	        employee.printemployedetails();

		

	}
	
	

}

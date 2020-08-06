class Employee {		
		int empId;
		char empInitial;
		String empName;
		String empDesignation;
		float empEMI;
		double empSalary;
		
		void init(int empId,char empInitial,String empName,String empDesignation,
		float empEMI,double empSalary)
		{
		this.empId=empId;
		this.empInitial=empInitial;
		this.empName=empName;
		this.empDesignation=empDesignation;
		this.empEMI=empEMI;
		this.empSalary=empSalary;
		}

		void disp() {
	    System.out.println("------------------------------------");	
		System.out.println("Employee Details");
		System.out.println("------------------------------------");
		System.out.println("Employee-ID : "+empId);
		System.out.println("Employee-Name : "+empInitial+"."+empName);
		System.out.println("Employee-Designation : "+empDesignation);
		System.out.println("EMI amount to be paid by Employee : "+empEMI);
		System.out.println("Employee-Salary : "+empSalary);
		}
}
 
 public class EmployeeDetails {
		public static void main(String[] args) {

		Employee employee1 = new Employee();
		employee1.init(1,'S',"Raj","Software Engineer",2050.60f,442000.54);

		Employee employee2=new Employee();
		employee2.init(2,'M',"Raja","Manager",3050.60f,542000.54);

		Employee employee3=new Employee();
		employee3.init(3,'C',"Raju","Traniee",1050.60f,342000.54);

		Employee employee4=new Employee();
		employee4.init(4,'A',"RAJESH","Trainee",1050.60f,342000.54);
		
		Employee employee5=new Employee();
		employee5.init(4,'J',"Ram","Trainee",1050.60f,342000.54);
		

        employee1.disp();
		employee2.disp();
		employee3.disp();
		employee4.disp();
		employee5.disp();
}
}

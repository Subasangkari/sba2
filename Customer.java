public class Customer {
	String CustomerFirstName;
	String CustomerMiddleName;
	String CustomerLastName;
    static int CustomerID;
    static String CustomerPost;
    double CustomerSalary;
public void init(String CustFirstName,String CustMidName,String CustLastName,double CustSalary){
    	String CustomerFirstName=CustFirstName;
    	String CustomerMiddleName=CustMidName;
    	String CustomerLastName=CustLastName;
        double CustomerSalary=CustSalary;
        }

static void disp(){
			System.out.println(CustomerID);
			System.out.println(CustomerPost);
			}
			void disp2(String CustomerFirstName,String CustomerMiddleName,String CustomerLastName,double CustomerSalary){
			System.out.println(CustomerFirstName+" "+CustomerMiddleName+" "+CustomerLastName);
			System.out.println(CustomerSalary);
			}
			void disp3(){
				System.out.println(CustomerFirstName);
				System.out.println(CustomerMiddleName);
				System.out.println(CustomerLastName);
				System.out.println(CustomerSalary);
				}
					
			public static void main(String[] args) {
			System.out.println("-------------------------------");
			System.out.println("Customer-Details");
			System.out.println("-------------------------------");
			disp();
			Customer d=new Customer();
			System.out.println("-------------------------------");
			System.out.println("Customer-1-Details");
			System.out.println("-------------------------------");
			
			d.disp2("Suba","Sangkari","Saravanan",342000.98670);
			
			Customer d1=new Customer();
			System.out.println("-------------------------------");
			System.out.println("Customer-2-Details");
			System.out.println("-------------------------------");
			d1.disp3();
			
			Customer d2=new Customer();
			System.out.println("-------------------------------");
			System.out.println("Customer-3-Details");
			System.out.println("-------------------------------");
		d2.disp2("Dinesh","Kumar","Karunathi",342000.98670);
			
			Customer d3=new Customer();
			System.out.println("-------------------------------");
			System.out.println("Customer-4-Details");
			System.out.println("-------------------------------");
			
			d3.disp2("Karthiga","Rathina","Pandi",342000.98670);
			
			Customer d4=new Customer();
			System.out.println("-------------------------------");
			System.out.println("Customer-5-Details");
			System.out.println("-------------------------------");
			
			d4.disp3();

			// const gets called when obj is created
			// static exists before object

			}


			static{
			CustomerID=101;
			CustomerPost="Associate Professional Software Engineer";
			}
			}


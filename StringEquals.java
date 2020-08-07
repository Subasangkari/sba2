
public class StringEquals {
boolean MyEquals(char str1 ,char str2) 
	{
		if (str1 == str2) 
		{
			return true;
		}
		else if(str1-32==str2) {
			return true;
		}
		else if(str1==str2-32) {
			return true;
		}
		else 
		{
			return false;
	}
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringEquals scm=new StringEquals();
		boolean data=scm.MyEquals('B','A');

		System.out.println(data);

	}
}

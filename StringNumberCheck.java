
public class StringNumberCheck {

	        String str1;
			String s1 ="yes";
			String s2="no";
			String isNumber(String data)
			{
			char[] arr=data.toCharArray();
			for(int i=0;i<data.length();i++){
			if(arr[i] >= 48 && arr[i] <= 57)
			{
			str1= s1;
			break;
			}
			else
			{
			str1= s2;
			}
			i++;
			}
			if(str1 == s1){
				System.out.println("True");
			}
			else 
			{
				System.out.println("False");
			}
			String manStr=new String(arr);
			return manStr;
			}
		public static void main(String[] args) {
				// TODO Auto-generated method stub
				StringNumberCheck scm=new StringNumberCheck();
				String data=scm.isNumber("hello90 world");
			}

		}

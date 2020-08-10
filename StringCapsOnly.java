
public class StringCapsOnly {
	
		String str1;
			String s1 ="yes";
			String s2="no";
			boolean isCapsOnly (String str) {
			char[] arr=str.toCharArray();
			for(int i=0;i<str.length();i++){
			if(arr[i] >= 'A' && arr[i] <= 'Z')
			{
			str1 = s1;			
			}
			else
			{
			 str1 = s2;
			}
			}
			if(str1 == s1){
				return true;
			}
			else 
			{
				return false;
			}
			}
		public static void main(String[] args) {
				// TODO Auto-generated method stub
				StringCapsOnly scm=new StringCapsOnly();
				boolean data=scm.isCapsOnly("HELLO WORLD");
				System.out.println(data);
			}


}

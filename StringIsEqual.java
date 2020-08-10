public class StringIsEqual {
	String Str1;
	String S1="yes";
	String S2="no";
boolean IsEqual (String str1,String str2) {
	
   	char[] arr=str1.toCharArray();
	char[] arr1=str2.toCharArray();
	if (arr.length==arr1.length) {
for(int i=0;i<str1.length();i++){
			if(arr[i] == arr1[i] || arr[i] == (arr1[i]+32) || arr[i]== (arr1[i]-32))
					{
					 Str1=S1;
					}
			else {
				Str1=S2;
			}
           }
           }
	if(Str1==S1) {
		return true;
	}
	else {
		return false;
	}
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringIsEqual scm=new StringIsEqual();
		boolean data=scm.IsEqual("HELLO","hellc");
		System.out.println(data);
	}
}

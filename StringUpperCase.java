
public class StringUpperCase {
String str1;
	String s1 ="yes";
	String s2="no";
	String hasUpper(String data)
	{
	char[] arr=data.toCharArray();
	for(int i=0;i<data.length();i++){
	if(arr[i] >= 'A' && arr[i] <= 'Z')
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
		System.out.println("Yes");
	}
	else 
	{
		System.out.println("No");
	}
	String manStr=new String(arr);
	return manStr;
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringUpperCase scm=new StringUpperCase();
		String data=scm.hasUpper("hello World");
	}

}


public class StrClassMethodsLast {
	String ReplaceLast(String str,char oldChar , char newChar)
	{
	char[] arr=str.toCharArray();
	for(int i=str.length()-1;i<str.length();i--){
	if(arr[i]==oldChar)
	{
	arr[i]=newChar;
	break;
	}
	}
	String manStr=new String(arr);
	return manStr;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrClassMethodsLast scm=new StrClassMethodsLast();
		String data=scm.ReplaceLast("Hello world", 'l', '@');

		System.out.println(data);

	}

}

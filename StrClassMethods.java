
public class StrClassMethods {
	String ReplaceFirst(String str,char oldChar , char newChar)
	{
	char[] arr=str.toCharArray();
	for(int i=0;i<str.length();i++){
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
		StrClassMethods scm=new StrClassMethods();
		String data=scm.ReplaceFirst("Hello world", 'l', '@');

		System.out.println(data);

	}

}

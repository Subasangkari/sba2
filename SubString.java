public class SubString {
String mySubStr(String data,int index) {
	char[] arr = data.toCharArray();
	for(int i = 0; i < data.length(); i++) {
		if( i >= index) {
	System.out.print(arr[i]);
	}
		
}
	System.out.println();
	String manStr = new String(arr);
	return manStr;

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubString scm = new SubString();
		String data = scm.mySubStr("hello", 1);
		
		SubString scm1 = new SubString();
		String data1 = scm1.mySubStr("hello world", 3);


	}

}

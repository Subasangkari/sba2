
public class StringMethods {
String strReverse (String rev) {
	char[] arr = rev.toCharArray();
	System.out.print("The Reverse of the given string is: ");
	for(int i =arr.length-1; i >= 0; i--) {
		System.out.print(arr[i]);
	}
	System.out.println();

	String manStr = new String(arr);
	return manStr;
}
String toLowerCase(String loCase) {
	char[] arr = loCase.toCharArray();
	System.out.print("The LowerCase version of the given string is: ");
	for(int i =0; i < arr.length; i++) {
		if(arr[i] >= 65 && arr[i] <=90) {
			arr[i]=(char)(arr[i]+32);	
			}
		else {
			arr[i]=arr[i];
		}
		System.out.print(arr[i]);
	}
	String manStr = new String(arr);
	return manStr;
}
String toUpperCase(String upCase) {
	char[] arr = upCase.toCharArray();
	System.out.println();
	System.out.print("The UpperCase version of the given string is: ");
	for(int i =0; i < arr.length; i++) {
		if(arr[i] >= 97 && arr[i] <= 122) {
			arr[i]=(char)(arr[i]-32);	
			}
		else {
			arr[i]=arr[i];
		}
		System.out.print(arr[i]);
	}
	String manStr = new String(arr);
	return manStr;
}

String toggleCase(String toCase) {
	char[] arr = toCase.toCharArray();
	System.out.println();
	System.out.print("The ToggledCase version of the given string is: ");
	for(int i =0; i < arr.length; i++) {
		if(arr[i] >= 97 && arr[i] <= 122) {
			arr[i]=(char)(arr[i]-32);	
			}
		else {
			arr[i]=(char)(arr[i]+32);
		}
		System.out.print(arr[i]);
	}
	String manStr = new String(arr);
	return manStr;
}
String ReverseMaintainsCapsPos(String revCapsPos) {
	char[] arr = revCapsPos.toCharArray();
	System.out.println();
	System.out.print("The ReverseMaintedCapsPosition of the given string is: ");
	String revloCase ="";
	for(int i =arr.length-1; i >= 0; i--){
	if(arr[i] >= 65 && arr[i] <=90) {
		arr[i]=(char)(arr[i]+32);	
		}
	else {
		arr[i]=arr[i];
	}
	revloCase=revloCase+arr[i];
}
String revCapsPosMan="";
String org = revCapsPos;
char[] or = org.toCharArray();
String rev = revloCase;
char[] re = rev.toCharArray();
for(int i=0; i < or.length; i++) {
	if(or[i] >= 65 && or[i] <=90) {
	   re[i]=(char)(re[i]-32);
	}
	revCapsPosMan=revCapsPosMan+re[i];
	}

System.out.println(revCapsPosMan);
		String manStr = new String(arr);
		return manStr;

}
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringMethods rev = new StringMethods();
		String rev1 = rev.strReverse("hello");

		StringMethods lower= new StringMethods();
		String lo = lower.toLowerCase("HeLLo");
		
		StringMethods upper= new StringMethods();
		String up = upper.toUpperCase("HeLLo");
		
		StringMethods toggle= new StringMethods();
		String to = toggle.toggleCase("HeLLo");
		
		StringMethods revCapspos= new StringMethods();
		String rcp =revCapspos.ReverseMaintainsCapsPos("HeLloWorld");

		StringMethods revCapspos1= new StringMethods();
		String rcp1 =revCapspos1.ReverseMaintainsCapsPos("MyJavaWorld");

	}

}

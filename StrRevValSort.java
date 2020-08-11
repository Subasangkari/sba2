
public class StrRevValSort {
	String StrReverse (String str) {
		char[] arr = str.toCharArray();
		System.out.print("The reversed string is: ");
		for(int i =arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		System.out.println();

		String manStr = new String(arr);
		return manStr;
		
		}
	String hasDigitsOnly (String str) {
	String str1= "True";
	String s1="valid";
	String s2="invalid";
		char[] arr = str.toCharArray();
		for(int i =0; i<str.length(); i++) {
			if(arr[i] >= 48 && arr[i] <= 57) {
			str1 = s1;	
			}
			else {
				str1=s2;
				}
		}
		if(str1 == s1) {
			System.out.println("The given string is valid.");
		}
		else {
			System.out.println("The given string is invalid.");
		}
		String manStr = new String(arr);
		return manStr;
		}

	String hasOnly10Digits (String str) {
		int count=0;
		char[] arr = str.toCharArray();
		for(int i =0; i<str.length(); i++) {
			if(arr[i] >= 48 && arr[i] <= 57) {
				count++;	
				}
			else {
				System.out.println("invalid input.");
				break;
				}
		}
		if(count == 10) {
			System.out.println("The given string is valid.");
		}
		else {
			System.out.println("The given string is inavalid.");
		}
		String manStr = new String(arr);
		return manStr;
		}
	
	int SortInAscending (int [] arr) {
		int i,j,temp;
		for(i =0; i<arr.length; i++)
		{
			for(j=0; j<arr.length; j++)
			{
			if(arr[i] < arr[j]) 
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			}
		}
		System.out.print("The ascending order of the array is: ");
		for(i =0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		return 0;
	}
	

	public static void main(String[] args) {
		StrRevValSort scm = new StrRevValSort();
		String data = scm.StrReverse("hello");
		
		StrRevValSort scm1 = new StrRevValSort();
		String data1 = scm1.hasDigitsOnly("12345");
		
		StrRevValSort scm2 = new StrRevValSort();
		String data2 = scm2.hasOnly10Digits("1234567890");
		
		int myarr[]= {1,5,7,3,2,4};
		StrRevValSort scm3 = new StrRevValSort();
		int data3 = scm3.SortInAscending(myarr);
			
		
	}

}

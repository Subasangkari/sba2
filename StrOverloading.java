
public class StrOverloading {
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


String mySubStr(String data,int index,int lastIndex) {
				char[] arr1 = data.toCharArray();
			for(int i = 0; i < data.length(); i++) {
				if( i < index || i >= index+lastIndex) {
				System.out.print(arr1[i]);
				}
				}
				System.out.println();
			String manStr = new String(arr1);
			return manStr;

		}

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				StrOverloading scm = new StrOverloading();
				String data = scm.mySubStr("hello", 1);
				
				StrOverloading scm1 = new StrOverloading();
				String data1 = scm1.mySubStr("hello world", 3);
				
				StrOverloading scm2 = new StrOverloading();
				String data2 = scm2.mySubStr("hello world", 2, 3);
				
				StrOverloading scm3 = new StrOverloading();
				String data3 = scm3.mySubStr("hello world", 1, 4);
				
				StrOverloading scm4 = new StrOverloading();
				String data4 = scm4.mySubStr("hello world", 4, 3);



			}
			}
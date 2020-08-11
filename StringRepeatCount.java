
public class StringRepeatCount {
	String myStrRepeat(String data) {
		int count = 0;
		int maxCount = 0;
		char c =' ';
		char b= ' ';
		
		char[] arr = data.toCharArray();
		for(int i = 0; i <data.length(); i++) {
			count =0;
			for(int j=0; j < data.length()-i;j++) {
					if(arr[i] == arr[i+j]) {
					count++;
					c=arr[i];
				}
			}
			if(maxCount<count) {
				maxCount=count;
				b=c;
		}
			}
		System.out.println(maxCount + " " +b);

		String manStr = new String(arr);
		return manStr;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringRepeatCount scm = new StringRepeatCount();
		String data = scm.myStrRepeat("hello");
		
		StringRepeatCount scm1 = new StringRepeatCount();
		String data1 = scm1.myStrRepeat("hello world");
		
		StringRepeatCount scm2 = new StringRepeatCount();
		String data2 = scm2.myStrRepeat("this is test");
		
		
	}

}

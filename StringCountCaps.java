
public class StringCountCaps {
	String str1;
	String s1 ="yes";
	String s2="no";
	int count=0;
	int CountCaps(String data)
	{
	char[] arr=data.toCharArray();
	for(int i=0;i<data.length();i++){
	if(arr[i] >= 'A' && arr[i] <= 'Z')
	{
	str1=s1;
	count =count+1;
	}
	else {
		str1 = s2;
	}
	}
	if(str1==s1) 
	return count;
return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCountCaps scm=new StringCountCaps();
		int data=scm.CountCaps("hellO World");
		System.out.println(data);
	}

}

import java.util.Scanner;
public class NumberOfZerosAtEnd {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:");
		int x = input.nextInt();
		int num;
		int count=0;
		while(x != 0){
		num=x%10;
		if(num==0)
		{
		count=count+1;
		}
		else
			break;
	    x=x/10;
		}
		System.out.println(count+ " zero's");
		

	}

}


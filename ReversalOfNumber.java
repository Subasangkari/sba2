
public class ReversalOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1234;
		int reversed=0;
		while(x != 0) {
            int digit = x % 10;
            reversed = reversed * 10+digit;
            x /= 10;
            System.out.print(reversed + ",");
            reversed=0;
            
        }
		

	}

}

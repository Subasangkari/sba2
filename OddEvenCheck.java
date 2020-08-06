import java.util.Scanner;
public class OddEvenCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:");
		int value = input.nextInt();
        if(value%2==0)
		System.out.println("Entered Number is Even.");
		else
		System.out.println("Entered Number is Odd.");
}

}

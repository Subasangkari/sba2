import java.util.Scanner;
public class DollarToRupee {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value in Dollar:");
		int value = input.nextInt();
		double Rupees= value*74.84;
		System.out.println(value + " Dollar in Rupees is " + (Rupees) );


	}

}

public class CalculationDemo {
int sum(int... x){
System.out.println("sum meth "+x[4]);

int sum=0;
int max=x[0];
int min=x[0];
int count = 0;
int count1 =0;
int count2=0;

for(int i=0; i<x.length;i++) {
	sum=sum+x[i];
	if(max<x[i]) {
		max=x[i];
	}
	if(min>x[i]) {
		min=x[i];
	}
	if(x[i]%2 == 0) {
		count=count+1;
	}
	else {
		count1=count1+1;
	}
	if(x[i]%3 == 0) {
		count2=count2+1;
	}

	
}
System.out.println("The value of total sum is: "+sum);
System.out.println("The maximum value is: "+max);
System.out.println("The minimum value is: "+min);
System.out.println("The number of even didgits is: "+count);
System.out.println("The number of odd didgits is: "+count1);
System.out.println("The number of digits divisible by 3 is: "+count2);
return 0;
}

public static void main(String[] args) {
CalculationDemo c=new CalculationDemo();
c.sum(10,1,4,8,9);
}

}


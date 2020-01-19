import java.util.Scanner;
public class Activity4{
		private double number;	
	public double M1(double number) throws NegativeNumberException{
			this.number=number;
	if(number<0){
		throw new NegativeNumberException();
		}
	else{
			return Math.sqrt(number);
		}
	
	}

public static void main(String args[]){
	double number;
	Scanner input=new Scanner(System.in);
	System.out.print("\nEnter the number: ");
	number=input.nextDouble();
	try{
		
		Activity4 obj=new Activity4();
	
		
	
	System.out.println("Square Root of the entered number: "+obj.M1(number));
	}
	

	catch(NegativeNumberException e){		
		System.out.println(e);
	}
}	

}
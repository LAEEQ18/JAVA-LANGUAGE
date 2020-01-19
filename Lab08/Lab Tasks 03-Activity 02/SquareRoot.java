import java.util.Scanner;

class SquareRoot extends Exception{
	public static void main(String args[]){
		
		int a;
		double b;
		Scanner number=new Scanner(System.in);
		System.out.print("\nEnter the number: ");
		a=number.nextInt();
		b=Math.sqrt(a);
		try{
		
		if(a<0){
			throw new ArithmeticException();
		}
		System.out.println("Square Root= "+b);
		
		}
		catch(ArithmeticException e){
		System.out.println("Negative numbers are not allowed");
		}




}



}
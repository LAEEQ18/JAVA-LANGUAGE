import java.util.Scanner;
public class Job{

	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int x;
		float y;
		System.out.print("Enter your age: ");
		x=input.nextInt();
		System.out.print("Enter your GPA: ");
		y=input.nextFloat();
		System.out.println();
			
		try{
			if(x<=25&&x>0&&y>=2.5){
				System.out.println("\nYour Application is accepted and is under study.");
			}
			
			try{
				if(y<2.5)
				throw new LowGpaException();		
								

				
					
			}
			catch(LowGpaException e){
			System.out.println(e);
			
			}
	
			if(x>25)
				throw new AgeOutOfRangeException();
				
			
		}
	
		
		catch(AgeOutOfRangeException e){
			System.out.print(e);					
			System.out.println();
		}
		

}
}
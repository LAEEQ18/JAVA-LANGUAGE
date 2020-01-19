
import java.util.Scanner;
public class run {
	public static void main(String args[])
	{
		Student_Organizer so1 =new Student_Organizer();
		
		
		int cs =1 , select ;
		
		Scanner inputs =new Scanner(System.in);
		Scanner inputi =new Scanner(System.in);
		Scanner input =new Scanner(System.in);
		
		while(cs==1)
        {
               System.out.println( "Menu of the Student Progress \n");
			   System.out.println("1 To add Student");
               System.out.println("2 To Remove Student");
               System.out.println("3 To remove a particular student ");
			   System.out.println("4 To print Count of Student ");
			   System.out.println("5 To print result of all student");
			   System.out.println("6 To print result of student");
			   System.out.println("7 To print name of all students");
			   System.out.println("8 To search the student ");
			   System.out.println("9 To check name duplicate ");
			   System.out.println("10 To calculate average of any subject ");
			   System.out.println("11 To calculate average total of subject  ");
			   
                select=(input.nextInt()); 
	
      switch (select) {
    	  
    	  case 1:
      
    		  System.out.println("Enter the Name you want to add");

    		  
    		  String s,l,f;
    			int ag,c,b,e,m,p,x1,x2;
		
		System.out.println("\n Enter First Name of Student");
		s=inputs.nextLine();
		
		System.out.println("\n Enter Last Name of Student");
		l=inputs.nextLine();
		
		System.out.println("\n Enter Father's Name of Student");
		f=inputs.nextLine();
		
		System.out.println("\n Enter Age of Student");
		ag=inputi.nextInt();
		
		System.out.println("\n Enter The Chemistry_Marks : ");
		c=inputi.nextInt();
		
		System.out.println("\n Enter The Biolgoy_Marks : ");
		b=inputi.nextInt();
		
		System.out.println("\n Enter The English_Marks : ");
		e=inputi.nextInt();
		
		System.out.println("\n Enter The Mathematics_Marks : ");
		m=inputi.nextInt();
		
		System.out.println("\n Enter The Physics_Marks : ");
		p=inputi.nextInt();
		
		Student s4= new Student (s,l,f,ag,c,b,e,m,p);

		so1.add(s,l,f,ag,c,b,e,m,p);
		
		break;
		
		 
          case 2:  
           System.out.println("Enter the INDEX  To Remove Student");
	        int ss=inputi.nextInt();
			so1.remove(ss);
           break;
           case 3:
           System.out.println("Enter the Name you want to remove");
          String n=inputs.nextLine();
		   so1.remove_pr(n);
			
			break;
		
           case 4:
           System.out.println("Number of students" +  so1.no_of_students());
			break;
			
			case 5:
			so1.PrintAll();
			break;
			
			case 6:
				 System.out.println("Enter the Name of student you want to get result");
			        String std=inputs.nextLine();
			           so1.nameResult(std);
						break;
			
			case 7:
		        System.out.println("Enter the Name you want to search");
		        String sv=inputs.nextLine();
		           so1.search_pr(sv);
					break;
			
			case 8:
			System.out.println("Enter the Name who has duplicate of it");
			String dd=inputs.nextLine();
			so1.Print_Duplicate();
			break;
			
			case 9:
			System.out.println("Enter the name of subject whoes average to be find");
			String avs=inputs.nextLine();
			so1.average_of_Subject(avs);
			break;
			
			case 10:
			so1.average();
			break;

          case 11:
		   cs=2;
		   break;


			}
   
   
   }    
	}




   
   
      
	

		
	/*	
		System.out.println("########## Result Card ##########");
		System.out.println("First Name: " + s4.gets() + "\nLast Name: " + s4.getl() + "\n Father Name: " + s4.getf()+  "\nAge: " + s4.getag()  );
		System.out.println("########## ######### ##########");
		System.out.println("Chem_Marks: " + s4.getc() +"\nBio_Marks: " + s4.getb() + "\nEng_Marks: " + s4.gete() + "\nMath_Marks: " + s4.getm() +"\nPhy_Marks: " + s4.getp());
		System.out.println("---------- ------- ---------");
		System.out.println("\nTotal_Marks: " + s4.getTotal_marks()+ "\nObtained_Marks: " + s4.getObtained_marks() );
		System.out.println("---------- ------- ---------");
		System.out.println("Percentage : " + s4.getPercentage()+ " % " + "\n Grade: " + s4.getGrade());
		System.out.println("---------- ------- ---------");
		
	/*	
		Student s5 =new Student(s4);
		
		
		System.out.println(" this is the data of the student 5");
		System.out.println("########## Result Card ##########");
		System.out.println("First Name: " + s5.gets() + "\nLast Name: " + s5.getl() + "\n Father Name: " + s5.getf()+  "\nAge: " + s5.getag()  );
		System.out.println("########## ######### ##########");
		System.out.println("Chem_Marks: " + s5.getc() +"\nBio_Marks: " + s5.getb() + "\nEng_Marks: " + s5.gete() + "\nMath_Marks: " + s5.getm() +"\nPhy_Marks: " + s5.getp());
		System.out.println("---------- ------- ---------");
		System.out.println("\nTotal_Marks: " + s5.getTotal_marks()+ "\nObtained_Marks: " + s5.getObtained_marks() );
		System.out.println("---------- ------- ---------");
		System.out.println("Percentage : " + s5.getPercentage()+ " % " + "\n Grade: " + s5.getGrade());
		System.out.println("---------- ------- ---------");

		
		
		
	/*Student s1=new Student("M","Laeeq","Asghar","xyz",18);
	System.out.println("########## Student DATA ##########");
	System.out.println( "Name: " + s1.gets()  + "\nMiddle Name " + s1.getm() + "\nFather Name: " + s1.getf() + "\nAddress: " + s1.getad() + "\nAge: " + s1.getag()  );

		Student s2=new Student("M.","Laeeq","Asghar","Lahore",18);
		System.out.println("########## Student DATA ##########");
		System.out.println("First Name: " + s2.gets() + "\nLast Name: " + s2.getl() + "\n Father Name: " + s2.getf()+ "\nAddress: " + s2.getad() + "\nAge: " + s2.getag()  );
		System.out.println("########## ######### ##########");
		
	
		Student s3=new Student("M.","Laeeq","Asghar","Lahore",18,97,98,96,99,98);
		System.out.println("########## Result Card ##########");
		System.out.println("First Name: " + s3.gets() + "\nLast Name: " + s3.getl() + "\n Father Name: " + s3.getf()+ "\nAddress: " + s3.getad() + "\nAge: " + s3.getag()  );
		System.out.println("########## ######### ##########");
		System.out.println("Chem_Marks: " + s3.getc() +"\nBio_Marks: " + s3.getb() + "\nEng_Marks: " + s3.gete() + "\nMath_Marks: " + s3.getm() +"\nPhy_Marks: " + s3.getp());
		System.out.println("---------- ------- ---------");
		System.out.println("\nTotal_Marks: " + s3.getTotal_marks()+ "\nObtained_Marks: " + s3.getObtained_marks() );
		System.out.println("---------- ------- ---------");
		System.out.println("Percentage : " + s3.getPercentage()+ " % " + "\n Grade: " + s3.getGrade());
		System.out.println("---------- ------- ---------");
		*/
	}




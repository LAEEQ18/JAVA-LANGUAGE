import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Student_Organizer {
 private ArrayList <Student> bscs;
 
 public Student_Organizer ()
 { bscs =new ArrayList <Student>();
 }
 
 public void add (String s,String l,String f,int ag,int c,int b, int e,int m,int p )
 {
	 bscs.add(new Student(s,l,f,ag,c,b,e,m,p));
 }
 
 public void remove(int ss)
 {
	 bscs.remove(ss);
	 
 }
 
 public void remove_pr(String n)
 {
	  Iterator <Student> it=bscs.iterator();
	  while (it.hasNext())
	  {
		  Student s ;
		  s=it.next();
		 if ( s.toString().equals(n))
		  it.remove();
	  }
 }
 
 public int no_of_students()
 {
	 return bscs.size();
 }
 
 public void search_pr(String sv)
 {
	 int count=0;
	 	for(Student ss: bscs)
	 		if(ss.gets().equals(sv))
	 		{
	 			ss.Print_Result();
	 			count=1;
	 	    }
	 		if(count==0)
	 			System.out.println("No match Found!");
	 		
 }
 
 public void PrintAll( )
 {
	 for ( Student ss : bscs)
		 ss.Print_Result();
		 
	//	System.out.println(ss.Print_Result());
 }
 
 public void StudentResult(String std)
 {
 	for(Student ss: bscs)
 		if(ss.toString().equals(std))
 		ss.Print_Result();
 }
 
 public void PrintALLName()
 {
 	for(Student ss: bscs)
 		System.out.println(ss.toString());
 }
 
 public void nameResult(String std)
 {
 	int count=0;
 	for(Student ss: bscs)
 		if(ss.gets().equals(std))
 		{
 			ss.Print_Result();
 			count=1;
 	    }
 		if(count==0)
 			System.out.println("No match Found!");
 		
 }
 
 public void Print_Duplicate()
 
 {
	 for (Student ss : bscs)
	 	{ for(Student xx : bscs)
	 		{ if (ss==xx)
	 			continue;
	 		else if ((ss.toString()).equals (xx.toString()));
	 		System.out.println("Dublicate= "+ ss.toString());
	 		}
	 	}
 }
 
 public void average_of_Subject(String avs)
 {
	 double total =0 ;
	 double Average =0;
	 
	 System.out.println("Please Enter The Subject that u need to calculate : Chemistry  Biology  English  Maths  Physics");
	  if (avs.equals("Chemistry"))
	  { 
    	 for(Student ss : bscs)
    	 {
    		 total = total + ss.getc();
    	 }
    Average = total/bscs.size(); }
	 
    
	 else if (avs.equals("Biology")) 
    	{
    		for(Student ss : bscs)
    		{
    			total = total + ss.getb();
    		}
    		
    		Average= total/ bscs.size();
    	}

    		else if (avs.equals("English"))
    		{
    			for(Student ss : bscs )
    			{
    				total = total + ss.gete();
    			}
    			Average = total / bscs.size();
    		}
		    		else if (avs.equals("Maths"))
		    		{
		    			for(Student ss : bscs )
		    			{
		    				total = total + ss.getm();
		    			}
		    			Average = total / bscs.size();
		    		}
    	
			    		else if (avs.equals("Physics"))
			    		{
			    			for(Student ss : bscs )
			    			{
			    				total = total + ss.getp();
			    			}
			    			Average = total / bscs.size();
			    		}
    	System.out.println("Average Marks are :  "+Average);
 }
  
 public void average()
 { double av = 0;
	 for(Student ss : bscs)
	 { av = av + ss.getTotal_marks();}
	 
	 av = (av / bscs.size() );
 }
  

/* public void remove_particular(String s_String)
 {
	for ( Student s1 : bscs )
	 {if (s1.contains(s_string)) }
	 System.out.println("removed name is :" + s1 + s1.remove(s1));
	 
 } */
 
	  
//	  public void searching (String searchString)
	//  {
		//  for( Student ss :bscs)
		  {
			//  if ( ss == searchString )
			  //{
				//  searchString = ss.contains(search String)
			  }
		  
 
 }
	 
 
 
 


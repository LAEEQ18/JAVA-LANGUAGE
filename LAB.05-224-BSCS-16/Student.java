
public class Student {
	public String First_Name;
	public  String Last_Name;
	public String Father_Name;
	public  String adress;
	public  int age;
	public  int Chem_marks;
	public  int Bio_marks;
	public  int Eng_marks;
	public  int Math_marks;
	public  int Phy_marks;
	public  double Grade ;
	public  double Percentage;
	private   double Total_marks;
	public   double Obtained_marks;
	
	
/* public Student(Student ss)
	
	{
	this.First_Name = ss.gets();
	this.Last_Name=  ss.getl();
	this.Father_Name = ss.getf();
	this.Chem_marks = ss.getc();
	this.Phy_marks = ss.getp();
	this.Bio_marks = ss.getb();
	this.Math_marks = ss.getm(); 
	this.Eng_marks = ss.gete(); 
	}
	*/
	public Student (String s,String l,String f,/*String ad,*/int ag,int c,int b, int e,int m, int p )
	{
		
		Last_Name =l;
		Father_Name = f;
	//	adress=ad;
		age = ag;
		Chem_marks=c;
		Bio_marks=b;
		Eng_marks=e;
		Math_marks=m;
		Phy_marks=p;
		//System.out.println("the obtained marks are "+getObtained_marks());
		
		{
		if(c<=100&&c>0)
		 {Chem_marks=c;}
		else 
		{Chem_marks=0;}
		
		if(b<=100&&b>0)
		{Bio_marks=b;}
		else 
			{Bio_marks=0;}
		
		if(e<=100&&e>0)
		{Eng_marks=e;}
		else
			{Eng_marks=0;}
		
		if(m<=100&&m>0)
		{ Math_marks=m;}
			else
			{Math_marks=0;}
	
		
		
			if(Phy_marks<=100&&Phy_marks>0)
			{ Phy_marks =p; }
				else
			Phy_marks=0;
		}
	
	//	Obtained_marks=obt;
		
	
	
	// new constructor for s5 to whom we call another
	
	//public Student()
	
	}
	
	public void setFirst_Name(String s) 
	{
		First_Name=s;
	}
	
	public void setLast_Name(String l) 
	{
		Last_Name=l;
	}
	
	public void setFather_Name(String f) 
	{
		Father_Name=f;
		
	}
	public void setadress(String ad) 
	{
		adress=ad;
	}
	public void setage(int ag) 
	{
		age=ag;
	}
	
	public void setChem_marks(int c)
	{
		if(c>100&&c<0)
		 {Chem_marks=0;}
		else 
		{Chem_marks=c;}
	}
	
	public void setBio_marks(int b)
	{
		if(b<=100&&b>0)
			{Bio_marks=b;}
			else 
				{Bio_marks=0;}
		
	}
	
	// when we use private the compiler gives an error.
	public void setEng_marks(int e) 
	{
		if(e<=100&&e>0)
		{Eng_marks=e;}
		else
			{Eng_marks=0;}
		
	}
	
	public void setMath_marks(int m) 
	{
		if(m<=100&&m>0)
		{ Math_marks=m;}
			else
			{Math_marks=0;}
	}
	
	public void setPhy_marks(int p) 
	{
		if(Phy_marks<=100&&Phy_marks>0)
			 Phy_marks=p;
			else
		Phy_marks=0;
	}
	
	
	
	public String gets()
	{
		return First_Name ;
	}
	
	
	
	public String getl()
	{
		return Last_Name;
	}
	public String getf()
	{
		return Father_Name;
	
	}
	
	public String getad()
	{
		return adress;
		
	}
	public int getag()
	{
	return age;
	}
	
	public int getc()
	{
		
		return Chem_marks;
	}
	
	public int getb()
	{
		
		return Bio_marks;
	}
	
	// when the method is private it can't be acess so compiler gives an error fr that.
	
	public int gete()
	{
		return Eng_marks;
	}
	
	public int getm()
	{
		return Math_marks;
		
	}
	
	public int getp()
	{
		
		return Phy_marks;
		}



	//for total & obtained marks:
/*public void setTotal_marks(int tot)
	{
	Total_marks=tot;
	tot=500;
} */

public double getTotal_marks()
{
	Total_marks=500;
	return Total_marks;
}
	
public double getObtained_marks()
{
	double obt=(Chem_marks + Bio_marks + Eng_marks + Phy_marks + Math_marks);
	Obtained_marks=obt;
	return Obtained_marks;
}

/*public int sum()
{
	int total=(Chem_marks + Bio_marks + Eng_marks + Phy_marks + Math_marks);
	return total;
}	
*/


public double getPercentage()
{
	Percentage=((Obtained_marks / Total_marks)*100);
		//p = Percentage;
	
	
	return Percentage;
}

public char getGrade()
{
	if (getPercentage() >= 90)
	{return 'A';
	}
			else if(getPercentage()>=80)
				{return'B';
				}
				else if(getPercentage()>=70)
				{return'C';
				}
				else if(getPercentage()>=60)
				{return'D';
				}
					else
						{return 'F';
						}
						}

	public void Print_Result()
	{
		
	
		
		System.out.println("########## Result Card ##########");
		System.out.println("First Name: " + gets() + "\nLast Name: " + getl() + "\n Father Name: " + getf()+  "\nAge: " + getag()  );
		System.out.println("########## ######### ##########");
		System.out.println("Chem_Marks: " + getc() +"\nBio_Marks: " + getb() + "\nEng_Marks: " + gete() + "\nMath_Marks: " + getm() +"\nPhy_Marks: " + getp());
		System.out.println("---------- ------- ---------");
		System.out.println("\nTotal_Marks: " + getTotal_marks()+ "\nObtained_Marks: " + getObtained_marks() );
		System.out.println("---------- ------- ---------");
		System.out.println("Percentage : " + getPercentage()+ " % " + "\n Grade: " + getGrade());
		System.out.println("---------- ------- ---------");
		
	}
	
}




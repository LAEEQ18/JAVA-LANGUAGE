
public class Sergeant extends Patrolman
{
protected static double baseSgtPay = 4700;
private double x;
private double y;

public Sergeant(String first, String last,int y)
{
super(first, last, y);
}

public double getBasePay(){
	return baseSgtPay;
	
}
public int benefitLevel(){

	return super.benefitLevel()+2;

}
public String getRank(){
	return "Sergeant";
}
public double earnings(){
	x=(baseSgtPay*82)/100;
	y=Math.sqrt(baseSgtPay);
	return (x+(1.2*y*getYearsOfService()));


}

}
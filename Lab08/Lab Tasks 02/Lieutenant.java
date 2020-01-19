
public class Lieutenant extends Sergeant
{
protected static double baseLieutenantPay = 5900;
private double x;
private double y;
public Lieutenant(String first, String last,int y)
{
super(first, last, y);
}

public double getBasePay(){
	return baseLieutenantPay;
	
}
public int benefitLevel(){

	return super.benefitLevel()+3;
}
public String getRank(){
	return "Lieutenant";
}
public double earnings(){
	x=(baseLieutenantPay*80)/100;
	y=Math.sqrt(baseLieutenantPay);
	return (x+(1.3*y*getYearsOfService()));


}
}
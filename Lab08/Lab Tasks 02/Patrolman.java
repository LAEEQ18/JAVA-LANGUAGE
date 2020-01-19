public class Patrolman extends Policeman
{
protected static double basePatrolPay = 3600;
protected int level;
private double x;
private double y;
private double z;
Patrolman(String first, String last, int y)
{
super(first,last,y);
}
public double getBasePay(){
	return basePatrolPay;
	
}
public int benefitLevel(){
		level=1;		
		return level;

}
public String getRank(){

	return "Patrolman";
}
public double earnings(){
	x=(basePatrolPay*85)/100;
	y=Math.sqrt(basePatrolPay);
	z=(y*6)/100;
	return (x+(z*getYearsOfService()));


} 

}
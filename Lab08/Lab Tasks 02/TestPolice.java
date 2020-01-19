import java.text.DecimalFormat;
class TestPolice{
	public static void main(String args[]){
		final int max=3;	
		double x;
		double a;
		DecimalFormat dos = new DecimalFormat("0.00");
		Policeman[] rank=new Policeman[max] ;
		rank[0]=new Patrolman("Road ","Runner",5);
		rank[1]=new Sergeant("Elmer ","Fudd",12);
		rank[2]=new Lieutenant("Daffy ","Duck",14);
		for(int i=0;i<rank.length;i++){
		System.out.print(rank[i].getRank()+": ");
		System.out.print(rank[i].toString());
		a=rank[i].earnings();
		System.out.println("\nEarnings= "+dos.format(a));
		System.out.println("Benefit Level= "+rank[i].benefitLevel());
		System.out.println();
		}
		x=rank[0].getBasePay()+rank[1].getBasePay()+rank[2].getBasePay();
		System.out.println("The average of the base bay is "+dos.format(x/3)+" per month");
		



}

}
public class Sphere extends ThreeDimensionalShape{
		private double radius;
		
	public Sphere(double radius,String color){

			this.color=color;
			this.radius=radius;
			surfaceArea=4*Math.PI*radius*radius;
			volume=(4*Math.PI*radius*radius*radius)/3;	
		}
	public String shapeName(){
			return "Sphere";

	}
	
}
public abstract class TwoDimensionalShape implements Shape{
	
	protected double area;
	protected String color;
	private String name;
	String dimension="Two Dimensional 2D";
	public double getVolume(){
		return 0;
	}
	public double getArea(){
			return area;
	}
		
	public String getDimension(){
		return dimension;
	}
	public String getColor(){
		return color;
	}
	
}
	
	
	
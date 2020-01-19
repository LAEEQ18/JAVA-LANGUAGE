public class Triangle extends TwoDimensionalShape{
		private double base;
		private double height;
		public Triangle(int base,int height,String color){
			this.color=color;
			this.base=base;
			this.height=height;
			area=(base*height)/2;
		
		}
		public String shapeName(){
			return "Triangle";
		}
				


}
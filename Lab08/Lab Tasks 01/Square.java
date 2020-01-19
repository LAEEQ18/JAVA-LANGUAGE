public class Square extends TwoDimensionalShape{
			private double side;
			
		public Square(double side,String color){
			this.color=color;
			this.side=side;
			area=side*side;
		}
		public String shapeName(){
			return "Square";
		}
	

}
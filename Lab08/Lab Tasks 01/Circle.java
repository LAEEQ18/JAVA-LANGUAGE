public class Circle extends TwoDimensionalShape {

		
		private double radius;
		public Circle(double radius,String color){
			this.color=color;
			this.radius=radius;	
			area=Math.PI*Math.pow(radius,2);
			
				
		}
		public String shapeName(){
			return "Circle";
		}
		


	}
public class Cuboid extends ThreeDimensionalShape{
		protected double length;
		protected double width;
		protected double height;	
		public Cuboid(double l,double w,double h,String color){
			this.color=color;
			this.length=l;
			this.width=w;
			this.height=h;
			surfaceArea=2*(l*w+l*h+h*w);
			volume=l*w*h;	
		}
		public String shapeName(){

			return "Cuboid";
		}
	

}
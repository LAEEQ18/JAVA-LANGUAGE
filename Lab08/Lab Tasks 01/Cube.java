public class Cube extends ThreeDimensionalShape{
			
			private double edge;		
			public Cube(double edge,String color){
				this.color=color;
				this.edge=edge;
				surfaceArea=6*this.edge*this.edge;
				volume=this.edge*this.edge*this.edge;	
			}
			public String shapeName(){

				return "Cube";
			}
			
}
public abstract class ThreeDimensionalShape implements Shape{
			
		protected double surfaceArea;
		protected double volume;
		protected String color;
		protected String dimension="Three Dimension 3D";
		public double getArea(){
			return surfaceArea;

			}

		public double getVolume(){
			return volume;
		}
		public String getDimension(){
		return dimension;
		}
		public String getColor(){
		return color;
		}

}
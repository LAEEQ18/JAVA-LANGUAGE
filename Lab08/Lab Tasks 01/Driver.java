class Driver{
	public static void main(String args[]){
		final int total=6;
		
		Shape[] shapes=new Shape[total];	//Parameters:
		shapes[0]=new Circle(2,"Red");  	//radius
		shapes[1]=new Square(5,"Green");	//sides
		shapes[2]=new Triangle(2,2,"Grey");	//base,height
		shapes[3]=new Sphere(2,"Yellow");	//radius
		shapes[4]=new Cube(2,"Black");		//edge
		shapes[5]=new Cuboid(2,3,4,"Pink");	//length,width,height
		for(int i=0;i<shapes.length;i++){
			String x=shapes[i].getDimension();
			System.out.println("Name= "+shapes[i].shapeName());
			System.out.println("Dimension= "+x);
			
			if(x=="Two Dimensional 2D"){
			System.out.println("Area= "+shapes[i].getArea());
			System.out.println("Color= "+shapes[i].getColor());
			System.out.println("------------------------------------------------");
			System.out.println();
			}
			else {
			System.out.println("Area= "+shapes[i].getArea());
			System.out.println("Volume= "+shapes[i].getVolume());
			System.out.println("Color= "+shapes[i].getColor());
			System.out.println("------------------------------------------------");
			System.out.println();	
		}
			
			
}

}






}
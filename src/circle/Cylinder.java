package circle;

public class Cylinder extends Circle{
	
	private double height;
	public Cylinder(){
		this.height=1;
	}
	public Cylinder(double radius){
		super(radius);
		this.height=1;
	}
	public Cylinder(double radius, double height){
		super(radius);
		this.height =height;
	}
	public double getHeight(){
		return height;
	}
	public double getVolume(Cylinder c){
		return c.getArea()*height;
	}
	@Override
	public double getArea(){
		return 2*PI*this.getRadius()*height+2*PI*this.getRadius()*this.getRadius();	
		}
	@Override
	public String toString(){
		return "Cylinder:"+" radius: "+this.getRadius()+" height:"+this.height;
	}
}

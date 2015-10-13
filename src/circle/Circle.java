package circle;

public class Circle {
	final double PI =3.14;
	private double radius;
	private String corlor;
	Circle(){
		this.radius=1;
		this.corlor ="red";
	}
	Circle(double radius){
		this.radius=radius;
	}
	public double getRadius(){
		return radius;
	}
	public double getArea(){
		return radius*PI*radius;
	}
	public String toString(){
		return "Circle has radius"+radius+"and color "+corlor;
	}
}

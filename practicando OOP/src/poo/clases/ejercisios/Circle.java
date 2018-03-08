package poo.clases.ejercisios;

public class Circle {
	
	
	public Circle() {// Constructor No.1
		radius = 1.0;
		color = "red";
	}
	
	
	public Circle(double r) {//Constructor No.2
		radius = r;
		color = "Red";
	}
	
	public Circle(double r , String c) {//Constructor No.3
		
		radius = r;
		color = c;
	}
	
	public String getColor() {// get Color of the Circle
		
		return color;
	}
	
	public double getRadius() {// get  Radius of the Circle
		return radius;
	}
	
	
	public double getArea() {// get The Area of the Circle
		return radius*radius*Math.PI;
	}
	
	public void setRadius(double nuevoRadio) {// set the Radius of the Circle
		
		radius = nuevoRadio;
	}
	public void setColor(String nuevoColor) {//set the Color of the circle
		
		color = nuevoColor;
		
	}
	
	public String toString() {
		
		return " Circle [Radius = " + radius + ", Color = " + color + "]";
	}
	//instance variables
	private double radius;
	private String color;

}

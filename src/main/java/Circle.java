public class Circle extends GeometricObject { 
private double radius;
public Circle() {}
public Circle(double radius) {this.radius = radius;}
public Circle(double radius, String color, boolean filled) { this.radius=radius; setColor(color); setFilled(filled);
} //… getRadius and setRadius are omitted
public double getArea() {return radius*radius*Math.PI; } // must be implemented public double getDiameter() {return 2*radius; }
public double getPerimeter() {return 2*radius*Math.PI; } // must be implemented 
public void printCircle() {
System.out.println(“The circle is created “ + getDateCreated() + “ and the radius is “
+ radius);}
public String toString() {
return “Circle created on “ + getDateCreated() + “\ncolor: “ + this.getColor() + “ and filled: “ + this.isFilled() + “ radius: “ + radius;}
}

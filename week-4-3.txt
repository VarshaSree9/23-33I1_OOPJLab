abstract class Shape
 {
   abstract double CalculateArea();
 }
 
 class Square extends Shape
 {
  double side;
  Square(double side)
  {
   this.side=side;
  }
  double CalculateArea()
  {
   return side*side;
  }
 }

 class Rectangle extends Shape
 {
  double length,breadth;
  Rectangle(double length,double breadth)
  {
   this.length=length;
   this.breadth=breadth;
  }
  double CalculateArea()
  {
   return length*breadth;
  }
 }

 public class Abstract
 {
  public static void main(String[] args)
  {
   Shape Square=new Square(3.9);
   Shape Rectangle=new Rectangle(1.3,4.4);
   System.out.println("Area of square:" +Square.CalculateArea());
   System.out.println("Area of rectangle:" +Rectangle.CalculateArea());
  }
 }
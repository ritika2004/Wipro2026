package Assignment4;

interface Polygon {

 double getArea();

 default double getPerimeter(int... sides) {
     int sum = 0;
     for (int side : sides) {
         sum += side;
     }
     return sum;
 }


 static String shapeInfo() {
     return "Polygons are closed shapes with multiple sides.";
 }
}


class Rectangle implements Polygon {
 int length, width;

 public Rectangle(int length, int width) {
     this.length = length;
     this.width = width;
 }

 public double getArea() {
     return length * width;
 }
}


class Triangle implements Polygon {
 int base, height;

 public Triangle(int base, int height) {
     this.base = base;
     this.height = height;
 }

 public double getArea() {
     return 0.5 * base * height;
 }
}


class PolygonTest {
 public static void main(String[] args) {

     Rectangle r = new Rectangle(10, 5);
     Triangle t = new Triangle(8, 6);

     System.out.println(Polygon.shapeInfo());

     System.out.println("\nRectangle Area: " + r.getArea());
     System.out.println("Rectangle Perimeter: " +
             r.getPerimeter(10, 5, 10, 5));

     System.out.println("\nTriangle Area: " + t.getArea());
     System.out.println("Triangle Perimeter: " +
             t.getPerimeter(3, 4, 5));
 }
}



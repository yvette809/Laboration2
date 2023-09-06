

public abstract class Shape implements Comparable<Shape> {

    //My abstract methods
    public abstract double getArea();
    public abstract double getPerimeter();


    // static method to create new shape

    public static Rectangle createRectangle(double length, double  width){
        return new Rectangle(length,width);

    }

    public static Circle createCircle(double radius){
        return new Circle(radius);
    }

    // compare to base on area
    public int compareTo(Shape other){
        return Double.compare(this.getArea(), other.getArea());
    }

    // implement equals and hashcode
    public boolean equals(Object o){
        if(this==o)return true;
        if(o==null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Double.compare(shape.getArea(), getArea()) == 0;
    }

    public int hashCode(){
        return Double.hashCode(getArea());
    }

}

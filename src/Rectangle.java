public class Rectangle extends Shape {
     private double length;
     private double width;

    public Rectangle(double width, double length){
        setWidth(width);
        setLength(length);

    }

    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }

    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;

    }

    @Override
    public double getArea() {
        return length * width;

    }

    @Override
    public double getPerimeter() {
        return 2 * (length * width);

    }
}

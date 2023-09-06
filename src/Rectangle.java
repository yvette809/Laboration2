public class Rectangle extends Shape {

    public Rectangle(int width, int height){
        setWidth(width);
        setHeight(height);

    }

    @Override
    public int getArea(int width, int height) {
        return width * height;

    }

    @Override
    public void getPerimeter() {

    }
}

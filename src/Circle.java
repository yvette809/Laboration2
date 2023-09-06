public class Circle extends Shape {
    public Circle (int radius){
        setRadius(radius);
    }

    @Override
    public int getArea(int width, int height) {
        return (int) (Math.PI * Math.pow(getRadius(), 2));
    }
    public void getPerimeter(){
    }
}

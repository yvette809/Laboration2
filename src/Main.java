
import java.util.*;
public class Main {
    public static void main(String[] args) {

        List<Shape> shapesList = new ArrayList<>();
        Set<Shape> shapesSet = new HashSet<>();
        // creating and adding shapes to the list and set
        shapesList.add(Shape.createRectangle(5, 4));
        shapesList.add(Shape.createCircle(6));
        shapesList.add(Shape.createRectangle(4, 7));
        shapesList.add(Shape.createCircle(5));

        shapesSet.add(Shape.createRectangle(5, 4));
        shapesSet.add(Shape.createCircle(6));
        shapesSet.add(Shape.createRectangle(4, 7));
        shapesSet.add(Shape.createCircle(5));

        // sorting the list based on area
        Collections.sort(shapesList);
        // Printing the sorted list
        System.out.println("Sorted Shapes (List):");
        for (Shape shape : shapesList) {
            System.out.println("Area: " + shape.getArea() + ", Perimeter: " + shape.getPerimeter());
        }

        // Printing the contents of the set
        System.out.println("\nShapes (Set):");
        for (Shape shape : shapesSet) {
            System.out.println("Area: " + shape.getArea() + ", Perimeter: " + shape.getPerimeter());

        }

    }

}
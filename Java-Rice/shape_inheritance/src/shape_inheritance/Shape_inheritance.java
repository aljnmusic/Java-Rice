package shape_inheritance;

/**
 *
 * Galos
 */
public class Shape_inheritance {

    public static void main(String[] args) {

        Triangle triangle = new Triangle();

        triangle.setFirstSide(3);
        triangle.setSecondSide(4);
        triangle.setThirdSide(5);

        triangle.setName("Triangle");
        triangle.setUnits("Meters");
        triangle.setisFilled(true);

        System.out.println("System Information\n");
        System.out.println("Name: " + triangle.getName());
        System.out.println("Units: " + triangle.getUnits());
        System.out.println("Is Filled: " + triangle.getisFilled());
        System.out.println("Area of Triangle: " + triangle.getArea() + " units squared");
        System.out.println("Perimeter of Triangle: " + triangle.getPerimeter() + " units");

    }
    
}

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
        System.out.println("Perimeter of Triangle: " + triangle.getPerimeter() + " units\n");


        Sphere sphere = new Sphere(3.0);
        Cube cube = new Cube(2.0);
        Tetrahedron tetrahedron = new Tetrahedron(5.0);

        System.out.println("\nSPHERE");
        System.out.println("Description: " + sphere.getDescription());
        System.out.println("Surface area: " + sphere.calculateSurfaceArea());
        System.out.println("Volume: " + sphere.calculateVolume() + "\n");

        System.out.println("\nCube");
        System.out.println("Description: " + cube.getDescription());
        System.out.println("Surface Area: " + cube.calculateArea());
        System.out.println("Volume: " + cube.calculateVolume() + "\n");

        System.out.println("\nTetrahedron");
        System.out.println("Description: " + tetrahedron.getDescription());
        System.out.println("Surface Area: " + tetrahedron.calculateArea());
        System.out.println("Volume: " + tetrahedron.calculateVolume() + "\n");

    }
    
}

package shape_inheritance;

public class Sphere extends ThreeDimensionalShape {
    private double radius;

    public Sphere(double radius){
        super("This is a Sphere");
        this.radius = radius;
    }

    public double calculateSurfaceArea(){
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculateVolume(){
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String getDescription(){
        return super.getDescription();
    }

    public double getRadius(){
        return this.radius;
    }


}

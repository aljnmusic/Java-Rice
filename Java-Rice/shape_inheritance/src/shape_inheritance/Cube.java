package shape_inheritance;

public class Cube extends ThreeDimensionalShape{
    public double sideLength;

    public Cube(double sideLength){
        super("This is a Cube");
        this.sideLength = sideLength;
    }

    public double calculateArea(){
        return 6 * Math.pow(sideLength, 2);
    }

    @Override
    public double calculateVolume(){
        return Math.pow(sideLength, 3);
    }

    @Override
    public String getDescription(){
        return super.getDescription();
    }

    public double getRadius(){
        return this.sideLength;
    }

}

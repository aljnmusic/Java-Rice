package shape_inheritance;

public class ThreeDimensionalShape extends Shape{
    private String description = "This is a three-dimensional shape";

    public ThreeDimensionalShape(String description){
        this.description = description;
    }

    public double calculateVolume(){
        return 0.0;
    }

    public String getDescription(){
        return this.description;
    }
}

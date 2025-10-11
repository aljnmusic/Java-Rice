package shape_inheritance;

public class Tetrahedron extends ThreeDimensionalShape {
    private double edgeLength;


    public Tetrahedron(double edgeLength){
        super("This is a Tetrahedron");
        this.edgeLength = edgeLength;
    }

    public double calculateArea(){
        return Math.sqrt(3) * Math.pow(edgeLength, 2);
    }

    @Override
    public double calculateVolume(){
        return Math.pow(edgeLength, 3) / (6 * Math.sqrt(2));
    }

    public double getEdgeLength(){
        return this.edgeLength;
    }

}

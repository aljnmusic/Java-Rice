package shape_inheritance;

public class TwoDimensionalShape extends Shape{
    private double area;
    private double perimeter;

    public void setArea(double area){
        this.area = area;
    }

    public double getArea(){
        return this.area;
    }

    public void setPerimeter(double perimeter){
        this.perimeter = perimeter;
    }

    public double getPerimeter(){
        return this.perimeter;
    }
}

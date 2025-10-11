package shape_inheritance;

public class Circle extends TwoDimensionalShape{
    public double radius;

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getDiameter(){
        return this.radius * 2;
    }

    @Override
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public double getPerimeter(){
        return Math.PI * this.getDiameter();
    }

}

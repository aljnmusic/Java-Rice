package shape_inheritance;

public class Rectangle extends TwoDimensionalShape{
    public double length;
    public double width;

    public void setLength(double length){
        this.length = length;
    }

    public double getLength(){
        return this.length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getWidth(){
        return this.width;
    }

    @Override
    public double getArea(){
        return this.length * this.width;
    }

    @Override
    public double getPerimeter(){
        return 2 * (this.length + this.width);
    }

}

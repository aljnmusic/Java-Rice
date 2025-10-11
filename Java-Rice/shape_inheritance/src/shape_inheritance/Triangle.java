package shape_inheritance;

public class Triangle extends TwoDimensionalShape {
    public double side1;
    public double side2;
    public double side3;

    public void setFirstSide(double side1) {
        this.side1 = side1;
    }

    public double getFirstSide(){
        return this.side1;
    }

    public void setSecondSide(double side2) {
        this.side2 = side2;
    }

    public double getSecondSide(){
        return this.side2;
    }

    public void setThirdSide(double side3) {
        this.side3 = side3;
    }

    public double getThirdSide(){
        return this.side3;
    }

    @Override
    public double getPerimeter(){
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public double getArea(){
        double s = this.getPerimeter() / 2;

        return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3) );
    }

}

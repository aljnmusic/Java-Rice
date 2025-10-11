package shape_inheritance;

public class Shape {
    public String name;
    public String units;
    public boolean isFilled;

    public void Shape(){
        this.name = "";
        this.units = "";
        this.isFilled = false;
    }

    public void Shape(String name){
        this.name = name;
    }

    public void Shape(String name, String units){
        this.name = name;
        this.units = units;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setUnits(String units){
        this.units = units;
    }

    public String getUnits(){
        return this.units;
    }

    public void setisFilled(boolean isFilled){
        this.isFilled = isFilled;
    }

    public boolean getisFilled(){
        return this.isFilled;
    }
}

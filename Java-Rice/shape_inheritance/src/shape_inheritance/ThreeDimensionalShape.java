package shape_inheritance;

public class ThreeDimensionalShape extends Shape{
    private float volume;
    private String description = "This is a three-dimensional shape";

    public void setVolume(float volume){
        this.volume = volume;
    }

    public float  getVolume(){
        return this.volume;
    }

    public String getDescription(){
        return this.description;
    }
}

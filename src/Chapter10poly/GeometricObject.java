package Chapter10poly;
import java.util.Date;
public abstract class GeometricObject {
    private String color = "white";
    private Date dateCreated;
    private boolean filled;

    public GeometricObject(){
        dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled){
        dateCreated = new Date();
        this.color = color;
        this.filled =filled;
    }

    public String getColor() {
        return color;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return String.format("created on %s color: %s and filled %b",dateCreated
        , color,filled);
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}

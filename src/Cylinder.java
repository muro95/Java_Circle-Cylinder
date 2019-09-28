import java.util.concurrent.CyclicBarrier;

public class Cylinder extends Circle {
    private  double height;

    public Cylinder(){

    }
    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double getArea(){
        return 2 * Math.PI * getRadius() * (getRadius() + getHeight());
    }
    public double getVolume(){
        return Math.PI * Math.pow(getRadius(),2) * getHeight();
    }
    @Override
    public String toString(){
        return "A Cylinder with radius "
                +getRadius()
                +", height = "
                +getHeight()
                +", Area = "
                +getArea()
                +", Volume = "
                +getVolume()
                +", which is a subclass of "
                +super.toString();
    }
}

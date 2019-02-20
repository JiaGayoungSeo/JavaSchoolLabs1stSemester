package Lab5_Class;

public class Rectangle {
    private double height;
    private double width;

    public Rectangle(){
        height = 1;
        width = 1;
    }
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }

    public void setHeight(double height){
        if(height<=0) this.height = 1;
        else this.height = height;
    }
    public void setWidth(double width){
        if(width<=0) this.width = 1;
        else this.width = width;
    }

    public double computeArea(){
        return getHeight()*getWidth();
    }

    public double computePerimeter(){
        return (2*getWidth()+2*getHeight());
    }
}

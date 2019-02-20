package Lab5_Class;

class Circle{
    private double radius;

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }


    public double computeArea(){
        return radius*radius*3.14;
    }

    public double computeCircumference(){
        return 2*Math.PI*radius;
    }
}



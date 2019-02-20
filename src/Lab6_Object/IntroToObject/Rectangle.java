package Lab6_Object.IntroToObject;

public class Rectangle {
    private int heigt;
    private int width;

    //은닉된 필드(멤버변수)에 값을 넣는다
    public void setHeigt(int heigt){
        this.heigt= heigt;
    }

    public void setWidth(int width){
        this.width = width;
    }

    //은닉된 멤버변수의 값을 읽어온다
    public int getHeigt(){
        return heigt;
    }

    public int getWidth(){
        return width;
    }

    //둘을 곱해 넓이를 구한다
    public int getArea(){
        return heigt*width;
    }

    //둘을 더하고 2배하여 둘레를 구한다
    public int getPerimeter(){
        return (heigt+width)*2;
    }
}

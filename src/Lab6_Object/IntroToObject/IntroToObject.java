package Lab6_Object.IntroToObject;

public class IntroToObject {
    public static void main(String[] args){
        //만든 클래스를 불러와서 객체 생성(인스턴스화=메모리할당)
        Rectangle myRectangle = new Rectangle();
        // Rectangle 클래스는 Heap영역에 저장되어있고 변수 myRectangle이 stack영역애서 new를 통해 리턴한다(참조한다,가리킨다)
        myRectangle.setHeigt(40);
        myRectangle.setWidth(20);
        System.out.println(myRectangle.getArea());
    }
}

class Ball{
    double radius; // 반지름

    //Ball 클래스의 생성자
    public Ball(double radius){
        this.radius = radius;
    }

    // 반지름을 설정하는 메소드
    public void setRadius(double radius){
        this.radius = radius;
    }
}
public class Prim {
    public static void main(String[] args) {
        int a = 10; // 기본 타입 변수 선언과 초기화
        int b = a; // 기본 타입 값 복사
        b = 20; // b의 값 변경

        System.out.println("a의 값 : " + a); //a의 값은 변경되지 않음
        System.out.println("b의 값 : " + b); //b의 값은 변경됨

        // Ball 객체 생성 및 참조 변수 할당
        Ball myBall =  new Ball(4.0); // 참조 타입 변수 선언과 객체 할당
        Ball yourBall = myBall; // 참조 타입 값(주소) 복사
        yourBall.setRadius(5.0); // yourBall를 통해 객체의 radius 변경

        System.out.println("myBall의 반지름: " + myBall.radius); // myBall의 radius 값도 변경됨
        System.out.println("yourBall의 반지름 : " + yourBall.radius); // yourBall의 radius 값

    }
}

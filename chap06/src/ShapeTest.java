class Circle{
    double r; // 원의 반지름

    // 생성자 : 원의 반지름을 초기화함

    public Circle(double r) {
        this.r = r;
    }

    // 원의 반지름을 반환하는 메서드
    double getR() {
        return r;
    }
    // 원의 면적을 계산하는 메서드
    double area(){
        return Math.PI * r * r;
    }
}
class Sphere extends Circle{
    // 생성자: 구의 반지름을 초기화 함
    public Sphere(double r) {
        super(r);
    }

    // 구의 부피를 계산하는 메서드
    double vol(){
        return(4.0/3.0) * Math.PI * Math.pow(r,3);
    }

    // 구의 표면적을 계산하는 메서드
    double surfArea(){
        // 부모클래스의 area() 메서드를 호출하여 면적을 계산하고 이를 바탕으로 구의 표면적 계산
        return 4 * super.area();
    }

    // 구의 정보를 출력하는 메서드
    void info(){
        // 구의 부피와 표면적을 출력함
        System.out.println("반지름: " + getR() + "인 구 부피: " + vol() +" 입니다");
        System.out.println("반지름: " + getR() + "인 구 표면적: " + surfArea() + "입니다");
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        // 반지름 10인 구 객체를 생성하고 정보출력
        Sphere b = new Sphere(10.0);
        b.info();
    }
}


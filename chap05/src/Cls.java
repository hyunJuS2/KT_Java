public class Cls {
    // 필드(변수)
    double radius;
    // 기본 생성자
    public Cls(){}
    // 생성자
    public Cls(double r){
        radius = r; // 반지름 초기화
    }

    double getVolume(){
        return  4.0/3.0 * Math.PI * Math.pow(radius, 3);
    }

    // 메서드 - 부피를 이용하여 표면적 계산
    double getArea(){
        return 4 * Math.PI * radius * radius;
    }

    // 메인 메서드 - 프로그램 실행 점
    public static void main(String[] args) {
        Cls ball = new Cls(2.0); // 객체 생성
        // -> 이렇게 커스텀한 생성자가 있다면 기본 생성자는 사라지기 때문에
        // 새롭게 기본 생성자를 불러와 줘야 함.
        // Cls ball2 = new Cls();

        System.out.println("부피 : " + ball.getVolume());
        System.out.println("표면적 : " + ball.getArea());
    }
}

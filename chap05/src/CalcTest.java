class  Calc{
    private double res; // 인스턴스 변수
    static final double PI = 3.14159; // 정적 상수

    //인스턴스 메서드 :  원외 넓이 계산
    public double area(double rad) {
        res = PI * rad * rad; // 인스터스 변수에 결과 저장
        return res;
    }

    // 정적 메서드 : 원외 둘레 계산
    public static double circ(double rad) {
        return 2 * PI * rad; // 직접 정적 변수 사용 PI는 static 변수라 선언가능
        // res = 2 * PI * rad; return res -> 인스턴스가 없어서 불가능
    }
}
public class CalcTest {
    public static void main(String[] args) {
        Calc calc = new Calc(); // Calc 인스턴스
        double a = calc.area(10); // 인스턴스 메서드 호출
        double c = Calc.circ(30); // 정적 메서드 호출

        System.out.println("넓이: " + a);
        System.out.println("둘레: " + c);
    }
}

public class CalculationDemo {
    public static void main(String[] args) {
        int i;
        long l;
        double d;

        i = 5/2;
        System.out.println("5/2 : " + i);

        d = 5/(float)2; //  d = 5/2.0; -> 정수 / 실수 -> 실수
        System.out.println("5/2 : " + d);

        i = 100000000 * 100000000; // -> 오버 플로로 인해 이상한 수가 나옴
        System.out.println(i);

        l = (long) 100000000 * 100000000; // 각 수는 int에 들어갈 수 있는데 결과가 int에 못들어감 -> long으로 형변환
        System.out.println(l);
    }
}

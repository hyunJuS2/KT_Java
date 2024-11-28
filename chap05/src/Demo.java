public class Demo {
    // 클래스 필드
    int field;

    public void showdiff(){
        // 메서드 지역변수
        int local = 7;

        // 클래스 필드에 지역변수의 값을 할당
        field = local;

        System.out.println("클래스 필드: " + field); // 출력: 클래스 필드 : 7
        System.out.println("메서드 지역변수: " + local); // 출력: 메서드 지역변수 : 7
    }

    public void changeField(){
        // 다음 메서드에서 클래스 필드의 값을 변경
        field = 10;

        // 'local' 변수는 여기서 접근할 수 없음(showDiff 메서드 내에서만 존재)

    }

    public static void main(String[] args) {
        Demo demoInstance = new Demo();
        demoInstance.showdiff();
        demoInstance.changeField();

        // 필드 값은 클ㄹ래스 전체에서 유지되므로 변경된 값이 출력됨
        System.out.println("변경된 클래스 필드 : " + demoInstance.field); // 출력 : 변경된 클래스 필드 : 10
    }
}

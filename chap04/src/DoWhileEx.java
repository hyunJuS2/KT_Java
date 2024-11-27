public class DoWhileEx {
    public static void main(String[] args) {
        int i = 1, j = 1;

        // while 반복문이 조건에 맞지 않으므로 실행되지 않음
        while (i < 1){
            System.out.println("while 루프 " + i + "번째 반복 실행중입니다.");
            i++;
        }
        System.out.println("while 루프 종료 후 변수 i의 값은 " + i + "입니다.");

        // do/while 반복문은 조건과 상관없이 무조건 한 번 실행됨
        do{
            System.out.println("do/while 루프 " + j + "번째 반복 실행중입니다.");
            j++;
        } while(j < 1);
        System.out.println("do/while 루프 종료 후 변수 j의 값은 " + j + "입니다.");
    }
}

public class ForEx {
    public static void main(String[] args) {
        // 초기화 부분에서 두 변수를 선언하고 초기화
        int i, sum = 0;

        // 5번 반복하는 for문
        for (i = 0; i < 5; i++){
            sum += i; // sum에 i를 더해서 누적 합계를 구함
            System.out.println("for 루프 " + (i + 1) + "번째 반복 실행중입니다.");
        }

        // 루프가 종료된 후, 반복 횟수와 누적 합계 출력
        System.out.println("for 루프 종료 후 반복 횟수: " + i);
        System.out.println("누적 합계 : " + sum);

        // 확장된 for문 사용 예
        int[] number = {1,2,3,4};
        for (int num : number) {
            System.out.println("확장된 for 루프에서 처리하는 값: " + num);
        }
    }
}

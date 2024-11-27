public class ArrayCreationDemo {
    public static void main(String[] args) {
        // 방법 1 : 배열 선언과 동시에 초기화 (선언과 생성을 한번에 처리)
        int[] scoresMethod1 = {100,50,50,95,85};
        // 방법 2 : new 키워드를 사용하여 배열 선언과 동시에 초기화
        int [] scoresMethod2 = new int[] {100,50,50,95,85};
        // 방법 3 : 배열 선언 후 , 나중에 new 키워드로 배열 생성과 초기화
        int [] scoresMethod3;
        scoresMethod3 = new int[]{100,50,50,95,85};

        // 배열의 크기만 지정해 놓는 방법은?
        int [] a = new int[2];
        a[0] = 100;
        a[1] = 90;

        // 배열 내용을 출력하여 확인
        System.out.println("방법 1로 생성한 배열");
        for(int score : scoresMethod1){
            System.out.print(score + " ");
        }
        System.out.println();
        System.out.println("방법 2로 생성한 배열");
        for (int score : scoresMethod2){
            System.out.print(score + " ");
        }
        System.out.println();
        System.out.println("방법 3로 생성한 배열");
        for (int score : scoresMethod3){
            System.out.print(score + " ");
        }

        System.out.println("배열 크기만 지정하고 후에 값을 추가할 경우");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }
}

public class ScoreWithArray {
    public static void main(String[] args) {
        // 점수를 저장할 배열 초기ㅘ
        int[] scores = {100,90,50,95,85};

        //정수의 합을 저장할 변수 초기화
        int sum = 0;

        // 배열을 사용하여 점수 합산
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        /* 향상된 for문
        for(int score : scores){
            sum += score;
        }*/

        //평균을 계산 (형 변환을 명시적으로 수행)
        double average = (double) sum / scores.length;

        //평균 점수를 출력
        System.out.println("평균 점수 : " + average + " , 총점 : " + sum);
    }
}

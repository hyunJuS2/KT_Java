public class StringCompareExample {
    public static void main(String[] args) {
        // 두 문자열 변수 초기화
        String firstString = "Hello World";
        String secondString = "Hello World";
        String thirdString = "hello World";

        //compareTo 메서드를 이용하여 두 문자열 비교
        int comparisonResult = firstString.compareTo(secondString);
        //compareTo는 같으면 0, 아니면 다른 값을 반환 // 다른 값이 나온다면 그 수는 얼만큼의 차이가 나는지를 알려줌
        System.out.println("fisrtString과 secondString 비교 : " + comparisonResult);

        // equals 메서드를 이용하여 두 문자열 비교
        boolean equalsResult = firstString.equals(secondString);
        //equals는 같으면 true, 다르면 false를 반환
        System.out.println("fisrtString과 secondString이 같음 : " + equalsResult);

        //compareTo 와 equals를 다른 문자열로 비교
        comparisonResult = firstString.compareTo(thirdString);
        equalsResult = firstString.equalsIgnoreCase(thirdString); // 새롭게 알아가는 사실 euqalsIgnorecase!


        System.out.println("fisrtString과 thirdString 비교 : " +comparisonResult);
        System.out.println("fisrtString과 thirdString 비교 : " + equalsResult);
    }
}

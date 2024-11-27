
public class StringMethodsDemo {
    public static void main(String[] args) {
        // 초기 문자열
        String originalString = " Java Programming ";

        // subString 메서드를 사용하여 부분 문자열 추출
        String subString = originalString.substring(5); // 5부터 시작해서 끝까지
        System.out.println("substring(5) 결과 : " + subString);
        // toLowerCase 메서드를 사용하여 문자열을 소문자로 변환
        String lowerCaseString = originalString.toLowerCase();
        System.out.println("toLowerCase() 결과 : " + lowerCaseString);
        // toUpperCase 메서드를 사용하여 문자열을 대문자로 변환
        String upperCaseString = originalString.toUpperCase();
        System.out.println("toUpperCase() 결과 : " + upperCaseString);

        // trim 메서드를 사용하여 양쪽 공백 제거
        String trimmedString = originalString.trim();
        System.out.println( "trim() 결과 : "+ trimmedString);
    }
}

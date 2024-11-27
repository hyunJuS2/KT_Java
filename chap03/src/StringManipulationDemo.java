public class StringManipulationDemo {
    public static void main(String[] args) {
        //문자열 변수 초기화
        String baseString = "Hello";
        String stringToConcat = " World";
        String searchString = "lo";

        // concat 메서드를 사용하여 문자열 연결
        String concatenatedString = baseString.concat(stringToConcat);
        System.out.println("연결된 문자열 : " + concatenatedString);

        // indexOf 메서드를 사요하여 부분 문자열의 인덱스 찾기
        int index = concatenatedString.indexOf(searchString);
        System.out.println("'" + searchString + "'의 인덱스: " + index);

        // isEmpty 메서드를 사용하여 문자열이 비어있는지 확인
        boolean isEmpty = baseString.isEmpty();
        System.out.println("baseString이 비어있음: " + isEmpty);

        // length 메서드를 사용하여 문자열의 길이 구하기
        int length = concatenatedString.length(); // length는 공백까지 포함하여 길이를 계산한다
        System.out.println("연결된 문자열의 길이 : " + length);
    }
}

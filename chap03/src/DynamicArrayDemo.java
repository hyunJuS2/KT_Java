import java.util.ArrayList;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        // String 타입의 ArrayList 생성
        ArrayList<String> stringList = new ArrayList<>();

        // ArrayList에 요소 추가
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");

        // ArrayList에서 요소 제거
        stringList.remove("Python"); // "Python" 문자열 제거
        // index를 이용하여 제거 가능
        //stringList.remove(1);

        // ArrayList에서 특정 인덱스의 요소 가져오기
        String elementAtIndex = stringList.get(1); // 인덱스 1의 요소 가져오기(C++)
        // ArrayList 의 크기(길이) 가져오기
        int size = stringList.size();

        // 결과 출력
        System.out.println("인덱스 1의 요소 : " + elementAtIndex);
        System.out.println("ArrayList의 크기 : " + size);
        System.out.println("ArrayList의 현재 요소들 : ");
        for(String s : stringList){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("1번 자리에 C# 추가");
        // 1번자리에 다른 값을 넣고 싶다면?
        stringList.add(1, "C#");

        for (String s : stringList){
            System.out.print(s + " ");
        }
    }
}

public class Person {
    // private 필드
    private String name;

    // 생성자
    public Person(String name){
        this.name = name; // 초기 이름 설정
    }

    public String getName() {
        return name; // 현재 인스턴스의 name 필드 값을 반환
    }

    public void setName(String name) {
        this.name = name; // 새로운 값으로 현재 인스턴스의 name 필드 값 변경
    }
}

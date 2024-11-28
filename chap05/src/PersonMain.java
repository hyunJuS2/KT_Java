public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Jane Dae"); //객체 생성

        // 접근자 메서드 호출하여 이름 출력
        System.out.println("이름 : " + person.getName());

        // 설정자 메서드를 사용하여 이름 변경
        person.setName("John Dae");

        // 변경한 이름 출력
        System.out.println("변경된 이름 : " + person.getName());
        // 불가능~ .name 같은 클래스에 없기 때문에
        //System.out.println(person.name);

    }
}


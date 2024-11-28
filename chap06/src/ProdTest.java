class Prod{
    int id;
    String nm; // 이름

    Prod(int id, String nm) {
        this.id = id;
        this.nm = nm;
    }
    // 정보 출력 메서드
    void info(){
        System.out.println(id + ":" + nm );
    }
}
// 상속받은 확장 클래스
class Extprod extends Prod{
    int qty; // 수량

    //확장 클래스의 생성자

    public Extprod(int id, String nm, int qty) {
        super(id, nm); // 상위 클래스 생성자 호출
        this.qty = qty;
    }

    // 오버라이드한 정보 출력 메서드
    @Override
    void info(){
        super.info(); // 상위 클래스 메서드 호출
        System.out.println("수량:" + qty);
    }
}
public class ProdTest {
    public static void main(String[] args) {
        Prod p = new Prod(1,"Pen");
        Extprod ep = new Extprod(2, "Notebook",10);

        p.info(); // "1:Pen"
        ep.info(); // "2:Notebook", "수량 : 10"
    }
}

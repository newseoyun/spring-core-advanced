package hello.proxy.pureproxy.concreteproxy.code;

public class ConcreteClient {

    private ConcreteLogic concreteLogic;

    // ConcreteLogic, TimeProxy 둘 다 주입 가능. (TimeProxy 가 ConcreteProxy 를 상속받았기 때문. 다형성 구현)
    public ConcreteClient(ConcreteLogic concreteLogic) {
        this.concreteLogic = concreteLogic;
    }

    public void execute() {
        concreteLogic.operation();
    }
}

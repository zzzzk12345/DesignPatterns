package beiwanglumoshi;

/**
 * @author zhangkai
 * @date 27/1/21
 */
public class Main {
    // 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样以后就可以将该对象恢复到原先保存的状态。
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("On");
        originator.show();

        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(originator.createMemento());

        originator.setState("Off");
        originator.show();

        originator.setMemento(careTaker.getMemento());
        originator.show();
    }
}

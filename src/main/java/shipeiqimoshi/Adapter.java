package shipeiqimoshi;

/**
 * @author zhangkai
 * @date 27/1/21
 */
public class Adapter extends Target{

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specialRequest();
    }
}

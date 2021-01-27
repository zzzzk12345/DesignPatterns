package shipeiqimoshi;

/**
 * @author zhangkai
 * @date 27/1/21
 */
public class Main {
    // 将一个类的接口转换成客户希望的另外一个借口，使得原本由于接口不兼容而不能一起工作的那些类可以一起工作
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}

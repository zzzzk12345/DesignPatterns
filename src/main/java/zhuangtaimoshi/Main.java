package zhuangtaimoshi;

/**
 * @author zhangkai
 * @date 27/1/21
 */
public class Main {
    // 当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类。
    public static void main(String[] args) {
        Context context = new Context(new StateImpl1());
        context.request();
        context.request();
        context.request();
        context.request();
        context.request();
    }
}

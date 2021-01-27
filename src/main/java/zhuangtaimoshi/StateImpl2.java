package zhuangtaimoshi;

/**
 * @author zhangkai
 * @date 27/1/21
 */
public class StateImpl2 implements State {
    public void handle(Context context) {
        context.setState(new StateImpl3());
    }
}

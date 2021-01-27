package zhuangtaimoshi;

/**
 * @author zhangkai
 * @date 27/1/21
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        System.out.println("原状态为"+this.getState().getClass().getName());
        this.state = state;
        System.out.println("状态改为"+state.getClass().getName());
    }

    public void request() {
        state.handle(this);
    }
}

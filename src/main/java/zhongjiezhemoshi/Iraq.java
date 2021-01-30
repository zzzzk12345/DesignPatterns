package zhongjiezhemoshi;

/**
 * @author zhangkai
 * @date 30/1/21
 */
public class Iraq extends Country {
    public Iraq(UnitedNations mediator) {
        super(mediator);
    }

    public void declare(String message) {
        mediator.declare(message, this);
    }

    public void getMessage(String message) {
        System.out.println("伊拉克获得消息："+message);
    }
}

package minglingmoshi;

/**
 * @author zhangkai
 * @date 28/1/21
 */
public class Main {
    public static void main(String[] args) {
        Barbecuer boy = new Barbecuer();
        Waiter girl = new Waiter();
        girl.setCommand(new BakeChickenWingCommand(boy));
        BakeMuttonCommand bm = new BakeMuttonCommand(boy);
        girl.setCommand(bm);
        girl.setCommand(new BakeMuttonCommand(boy));
        girl.notifyBarbecuer();
        girl.cancel(bm);
        girl.notifyBarbecuer();
        girl.cancel(new BakeMuttonCommand(boy));
        girl.notifyBarbecuer();
    }
}

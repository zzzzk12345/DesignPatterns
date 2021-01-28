package minglingmoshi;

/**
 * @author zhangkai
 * @date 28/1/21
 */
public abstract class Command {
    protected Barbecuer barbecuer;

    public Command(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    public abstract void executeCommand();
}

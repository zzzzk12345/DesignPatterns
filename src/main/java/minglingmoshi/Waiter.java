package minglingmoshi;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangkai
 * @date 28/1/21
 */
public class Waiter {
    private List<Command> commands = new ArrayList<Command>();

    public void setCommand(Command command) {
        commands.add(command);
        System.out.println("增加订单：" + command.toString());
    }

    public void cancel(Command command) {
        commands.remove(command);
        System.out.println("取消订单：" + command.toString());
    }

    public void notifyBarbecuer() {
        for (Command command : commands) {
            command.executeCommand();
        }
    }
}

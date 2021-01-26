package guanchazhemoshi;

import java.util.Observable;
import java.util.Observer;

/**
 * @author zhangkai
 * @date 26/1/21
 */
public class TaobaoObserver implements Observer {
    public void update(Observable observable, Object o) {
        String newProduct = (String) o;
        System.out.println("淘宝发送新产品【"+newProduct+"】到淘宝商城");
    }
}

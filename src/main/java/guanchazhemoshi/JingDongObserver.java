package guanchazhemoshi;

import java.util.Observable;
import java.util.Observer;

/**
 * @author zhangkai
 * @date 26/1/21
 */
public class JingDongObserver implements Observer {
    public void update(Observable observable, Object o) {
        String newProduct = (String) o;
        System.out.println("京东发送新产品【" + newProduct + "】到京东商城。");
    }
}

package guanchazhemoshi;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * @author zhangkai
 * @date 26/1/21
 */
public class ProductList extends Observable {
    private List<String> productList;

    private static ProductList instance;

    private ProductList() {
    }

    /**
     * 单例模式获得实例
     *
     * @return
     */
    public static ProductList getInstance() {
        if (instance == null) {
            instance = new ProductList();
            instance.productList = new ArrayList<String>();
        }
        return instance;
    }

    /**
     * 添加监听者
     *
     * @param observer
     */
    public void addListener(Observer observer) {
        this.addObserver(observer);
    }

    public void addProduct(String product) {
        productList.add(product);
        System.out.println("新产品" + product + "被添加");
        // 设置被监听者发生了变化
        this.setChanged();
        // 通知监听者
        this.notifyObservers();
    }

    public static void main(String[] args) {
        ProductList productList = ProductList.getInstance();
        TaobaoObserver taobaoObserver = new TaobaoObserver();
        JingDongObserver jingDongObserver = new JingDongObserver();
        productList.addObserver(taobaoObserver);
        productList.addObserver(jingDongObserver);
        productList.addProduct("印度神油");
    }
}

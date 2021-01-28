package danlimoshi;

/**
 * @author zhangkai
 * @date 28/1/21
 */
public class SingletonEHan {
    // 这种静态初始化的方式在自己被加载的时候就将自己实例化，所以称为饿汉式。另外两种属于懒汉式。
    private static SingletonEHan instance = new SingletonEHan();

    private SingletonEHan() {

    }

    public static SingletonEHan getInstance() {
        return instance;
    }
}

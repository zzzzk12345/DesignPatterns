package danlimoshi;

/**
 * @author zhangkai
 * @date 28/1/21
 */
public class SingletonMultiThread {
    // 双重锁定
    private static SingletonMultiThread instance;

    private SingletonMultiThread() {

    }
    // 不在方法上面加synchronized的原因是初始化只在第一次调用时出现，后面的调用都没必要加锁
    public static SingletonMultiThread getInstance() {
        if (instance == null) {
            synchronized (SingletonMultiThread.class) {
                /*
                * 为什么里面还需要判断一次
                * 当instance==null时，如果有两个线程同时通过了第一层if，然后由于锁机制，只能有一个线程进入，另一个在排队等候，
                * 第二层判断是为了防止第一个线程创建实例后，第二个线程继续创建实例的情况发生
                * */
                if (instance == null) {
                    instance = new SingletonMultiThread();
                }
            }
        }
        return instance;
    }
}

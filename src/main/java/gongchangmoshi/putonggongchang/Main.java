package gongchangmoshi.putonggongchang;

/**
 * @author zhangkai
 * @date 26/1/21
 */
public class Main {
    /*工厂模式把简单工厂的内部逻辑判断移动到了客户端代码来进行，即简单工厂类的修改在工厂类内部，普通工厂模式的修改在客户端*/
    public static void main(String[] args) {
        //IFactory iFactory = new UnderGraduateFactory();
        IFactory iFactory = new VolunteerFactory();
        LeiFeng leiFeng = iFactory.createLeiFeng();
        leiFeng.buyRice();
        leiFeng.sweep();
        leiFeng.wash();
    }
}

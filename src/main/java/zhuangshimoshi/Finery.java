package zhuangshimoshi;

import zhuangshimoshi.jutifushi.*;

/**
 * @author zhangkai
 * @date 25/1/21
 */
public class Finery extends Person{
    protected Person component;

    // 打扮
    public void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }

    public static void main(String[] args) {
        Person p = new Person("张凯");
        System.out.println("第一种装扮");
        Sneakers snk = new Sneakers();
        BigTrouser bt = new BigTrouser();
        TShirts ts = new TShirts();
        snk.decorate(p);
        bt.decorate(snk);
        ts.decorate(bt);
        ts.show();
        System.out.println("第二种装扮");
        LeatherShoes ls = new LeatherShoes();
        Tie tie = new Tie();
        Suit s = new Suit();
        ls.decorate(p);
        tie.decorate(ls);
        s.decorate(tie);
        s.show();
    }
}


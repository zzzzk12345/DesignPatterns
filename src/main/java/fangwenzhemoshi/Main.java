package fangwenzhemoshi;

/**
 * @author zhangkai
 * @date 30/1/21
 */
public class Main {
    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();
        o.attach(new Man());
        o.attach(new Woman());
        o.show(new Success());
        o.show(new Failure());
    }
}
